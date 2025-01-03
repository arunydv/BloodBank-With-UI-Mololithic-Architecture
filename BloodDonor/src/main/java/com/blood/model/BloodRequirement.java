package com.blood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BloodRequirement {
	    @Id
	    @Column(length = 10,nullable = false)
	    private String hospitalId; 
	    @Column(length = 10,nullable = false)
	    private String name;
	    @Column(length = 10,nullable = false)
	    private String patientName;
	    @Column(nullable = false, columnDefinition = "INT(2)")
	    private int patientage;
	    @Column(length = 3,nullable = false)
	    private String bloodgroup;
		public String getHospitalId() {
			return hospitalId;
		}
		public void setHospitalId(String hospitalId) {
			this.hospitalId = hospitalId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public int getPatientage() {
			return patientage;
		}
		public void setPatientage(int patientage) {
			this.patientage = patientage;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public BloodRequirement(String hospitalId, String name, String patientName, int patientage, String bloodgroup) {
			super();
			this.hospitalId = hospitalId;
			this.name = name;
			this.patientName = patientName;
			this.patientage = patientage;
			this.bloodgroup = bloodgroup;
		}
		@Override
		public String toString() {
			return "BloodRequirement [hospitalId=" + hospitalId + ", name=" + name + ", patientName=" + patientName
					+ ", patientage=" + patientage + ", bloodgroup=" + bloodgroup + "]";
		}
		public BloodRequirement() {
			super();
			// TODO Auto-generated constructor stub
		}
}
