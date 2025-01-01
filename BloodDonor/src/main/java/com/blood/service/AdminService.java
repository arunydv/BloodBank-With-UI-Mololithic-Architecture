package com.blood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.repository.DonorRepository;
import com.blood.repository.HospitalRepository;
import com.blood.repository.PatientRepository;

@Service
public class AdminService {

	@Autowired(required=true)
	private HospitalRepository hospitalRepo;
	@Autowired(required=true)
	private PatientRepository patientRepo;
	@Autowired(required=true)
	private DonorRepository donorRepo;
	
	
}
