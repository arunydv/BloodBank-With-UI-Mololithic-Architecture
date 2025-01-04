package com.blood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.model.BloodRequirement;
import com.blood.model.Donor;
import com.blood.model.Hospital;
import com.blood.model.Patient;
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

	public Hospital saveHospital(Hospital hospital) {
		return hospitalRepo.save(hospital);
	}
	
	public Patient addPatient(Patient patient) {
		return patientRepo.save(patient);
	}
	
	public List<Donor> getDonorsByBloodGroup(String bloodGroup) {
		return donorRepo.findByBloodWithoutPassword(bloodGroup);
	}
	

	public List<Donor> getDonorsWithoutPassword() {
		return donorRepo.findAllDonorsWithoutPassword();
	}
}
