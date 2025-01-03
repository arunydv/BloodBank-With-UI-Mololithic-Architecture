package com.blood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.model.BloodRequirement;
import com.blood.repository.BloodRequirementRepo;
import com.blood.repository.DonorRepository;
import com.blood.repository.HospitalRepository;
import com.blood.repository.PatientRepository;

@Service
public class AdminService {

	@Autowired
	private HospitalRepository hospitalRepo;
	@Autowired
	private PatientRepository patientRepo;
	@Autowired
	private DonorRepository donorRepo;
	@Autowired
	private BloodRequirementRepo bloodRequirementRepo;
	
	public BloodRequirement saveBloodRequirement(BloodRequirement bloodRequirement) {
		return bloodRequirementRepo.save(bloodRequirement);
	}
}
