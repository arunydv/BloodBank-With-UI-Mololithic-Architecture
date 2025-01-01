package com.blood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blood.model.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, String> {

	List<Donor> findByBlood(String blood);
}
