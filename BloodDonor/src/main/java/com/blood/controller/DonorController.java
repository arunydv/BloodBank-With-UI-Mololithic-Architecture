package com.blood.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.blood.model.BloodDonation;
import com.blood.model.Donor;
import com.blood.model.Hospital;
import com.blood.model.Patient;
import com.blood.service.DonorService;

@Controller
public class DonorController {

	@Autowired
	private DonorService donorService;

	@PostMapping("/register")
	public ResponseEntity<Map<String, String>> registration(@RequestBody Donor donor) {
		// Register the donor (this part is assumed to be in your service)
		donorService.register(donor);

		// Create a response map
		Map<String, String> response = new HashMap<>();
		response.put("status", "success");
		response.put("message", "Registration successful!");

		// Return the response as JSON with HTTP status OK
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/patients/{bloodGroup}")
	public List<Patient> listPatientsByBloodGroup(@PathVariable String bloodGroup) {
		return donorService.getPatientsByBloodGroup(bloodGroup);
	}

	@GetMapping("/hospital/{address}")
	public List<Hospital> getDonorsByBloodGroup(@PathVariable String address) {
		return donorService.gethospital(address);
	}

	@PostMapping("/donation")
	public ResponseEntity<String> donationregistraion(@RequestBody BloodDonation bloodonation) {
		donorService.registerdonation(bloodonation);
		return new ResponseEntity<>("Registered", HttpStatus.OK);
	}

	@PostMapping("/donorlogin")
	public ResponseEntity<Map<String, String>> donorlogin(@RequestBody Donor donor) {
		boolean valid = donorService.validateDonor(donor);

		Map<String, String> response = new HashMap<>();

		if (valid) {
			response.put("status", "success");
			response.put("message", "Login successful!");
			// Optionally, include a redirect URL if required
			response.put("redirect", "/"); // Modify with actual redirection URL if needed
			return ResponseEntity.ok(response);
		} else {
			response.put("status", "error");
			response.put("message", "Invalid ID or password!");
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
		}
	}

}
