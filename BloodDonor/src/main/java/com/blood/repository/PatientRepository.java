package com.blood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blood.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{

	@Query("SELECT p FROM Patient p WHERE p.bloodgroup = :bloodgroup")
    List<Patient> findByBloodGroup(@Param("bloodgroup") String bloodgroup);
}
