package com.blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blood.model.BloodRequirement;

@Repository
public interface BloodRequirementRepo extends JpaRepository<BloodRequirement, String> {

}
