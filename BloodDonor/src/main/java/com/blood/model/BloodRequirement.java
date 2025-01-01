package com.blood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class BloodRequirement {
	    @Id
	    @Column(name = "hospital_id")
	    private String hospitalId; // Primary key and foreign key

	    @OneToOne(optional = false)
	    @JoinColumn(name = "hospital_id", referencedColumnName = "id")
	    private Hospital hospital;
	    @Column(length = 10,nullable = false)
	    private String patientName;
	    @Column(nullable = false, columnDefinition = "INT(2)")
	    private int patientage;
	    @Column(length = 3,nullable = false)
	    private int bloodgroup;
}
