package com.blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blood.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{

}
