package com.blood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blood.model.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor, String> {
	 @Query("SELECT new com.blood.model.Donor(d.donorId, d.firstname, d.lastname, d.dob, d.address, d.contact, d.blood) " +
	           "FROM Donor d WHERE d.blood = :blood")
	    List<Donor> findByBloodWithoutPassword(@Param("blood") String blood);
	 
	 @Query("SELECT new com.blood.model.Donor(d.donorId, d.firstname, d.lastname, d.dob, d.address, d.contact, d.blood) FROM Donor d")
	    List<Donor> findAllDonorsWithoutPassword();
}
