package com.blood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.blood.model.BloodDonation;
import com.blood.model.Donor;
import com.blood.model.Hospital;
import com.blood.model.Patient;
import com.blood.repository.BloodDonationRepo;
import com.blood.repository.DonorRepository;
import com.blood.repository.HospitalRepository;
import com.blood.repository.PatientRepository;

@Service
public class DonorService {

	@Autowired
	private HospitalRepository hospitalRepo;
	@Autowired
	private PatientRepository patientRepo;
	@Autowired
	private DonorRepository donorRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private BloodDonationRepo bloodrepo;

	public Donor register(Donor donor) {
		donor.setPassword(passwordEncoder.encode(donor.getPassword()));
		return donorRepo.save(donor);
	}

	public List<Patient> getPatientsByBloodGroup(String bloodGroup) {
		return patientRepo.findByBloodGroup(bloodGroup);
	}

	public List<Hospital> gethospital(String address) {
		return hospitalRepo.findByAddress(address);
	}

	public BloodDonation registerdonation(BloodDonation bloodonation) {
		return bloodrepo.save(bloodonation);
	}
}
