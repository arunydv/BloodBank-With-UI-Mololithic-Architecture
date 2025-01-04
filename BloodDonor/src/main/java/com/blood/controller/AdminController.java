package com.blood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blood.model.BloodRequirement;
import com.blood.model.Donor;
import com.blood.model.Hospital;
import com.blood.service.AdminService;
import com.blood.service.DonorService;

@RestController
public class AdminController {

	@Autowired
	private DonorService donorService;
	@Autowired
	private AdminService adminService;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/donors/{bloodGroup}")
	public List<Donor> getDonorsByBloodGroup(@PathVariable String bloodGroup) {
		return donorService.getDonorsByBloodGroup(bloodGroup);
	}

	@PostMapping("/bloodrequirement")
	public ResponseEntity<String> requirement(@RequestBody BloodRequirement bloodRequirement) {
		adminService.saveBloodRequirement(bloodRequirement);
		return new ResponseEntity<>("Registered", HttpStatus.OK);
	}
	
	@PostMapping("/hospital")
	public ResponseEntity<String> hospitaldetails(@RequestBody Hospital hospital) {
		adminService.saveHospital(hospital);
		return new ResponseEntity<>("Registered", HttpStatus.OK);
	}
}
