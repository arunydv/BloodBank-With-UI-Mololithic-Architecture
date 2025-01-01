package com.blood.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.blood.model.Donor;
import com.blood.service.DonorService;


@RestController
public class AdminController {
	
	@Autowired
	private DonorService donorService;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/donors/{bloodGroup}")
    public List<Donor> getDonorsByBloodGroup(@PathVariable String bloodGroup) {
        return donorService.getDonorsByBloodGroup(bloodGroup);
	}
}
