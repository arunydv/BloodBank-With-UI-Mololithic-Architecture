package com.blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blood.model.BloodDonation;
@Repository
public interface BloodDonationRepo extends JpaRepository<BloodDonation, String> {

}
