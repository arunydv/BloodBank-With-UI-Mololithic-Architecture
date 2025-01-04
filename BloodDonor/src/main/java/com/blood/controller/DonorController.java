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

import com.blood.model.Donor;
import com.blood.model.Patient;
import com.blood.service.DonorService;

@RestController
public class DonorController {

	@Autowired
	private DonorService donorService;

	@PostMapping("/register")
	public ResponseEntity<String> registration(@RequestBody Donor donor){
		donorService.register(donor);
		return  new ResponseEntity<>("Registered",HttpStatus.OK);		
	}
	
	@GetMapping("/patients/{bloodGroup}")
    public List<Patient> listPatientsByBloodGroup(@PathVariable String bloodGroup) {
        return donorService.getPatientsByBloodGroup(bloodGroup);
    }
}