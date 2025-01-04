package com.blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood.model.BloodDonation;

public interface BloodDonationRepo extends JpaRepository<BloodDonation, String> {

}
