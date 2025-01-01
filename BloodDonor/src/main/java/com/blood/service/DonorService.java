package com.blood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.blood.model.Donor;
import com.blood.repository.DonorRepository;
import com.blood.repository.HospitalRepository;
import com.blood.repository.PatientRepository;

@Service
public class DonorService {

	@Autowired(required = true)
	private HospitalRepository hospitalRepo;
	@Autowired
	private PatientRepository patientRepo;
	@Autowired(required = true)
	private DonorRepository donorRepo;
	@Autowired(required = true)
	private PasswordEncoder passwordEncoder;

	public Donor register(Donor donor) {
		donor.setPassword(passwordEncoder.encode(donor.getPassword()));
		return donorRepo.save(donor);
	}
	
	 public List<Donor> getDonorsByBloodGroup(String bloodGroup) {
	        return donorRepo.findByBlood(bloodGroup);
	}
 }
