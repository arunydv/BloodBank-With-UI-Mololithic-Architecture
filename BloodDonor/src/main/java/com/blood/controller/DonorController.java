package com.blood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blood.model.Donor;
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
}