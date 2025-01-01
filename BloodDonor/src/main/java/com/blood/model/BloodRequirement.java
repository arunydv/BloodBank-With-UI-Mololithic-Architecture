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
		public String getHospitalId() {
			return hospitalId;
		}
		public void setHospitalId(String hospitalId) {
			this.hospitalId = hospitalId;
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
		public int getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(int bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public BloodRequirement(String hospitalId, String patientName, int patientage, int bloodgroup) {
			super();
			this.hospitalId = hospitalId;
			this.patientName = patientName;
			this.patientage = patientage;
			this.bloodgroup = bloodgroup;
		}
		@Override
		public String toString() {
			return "BloodRequirement [hospitalId=" + hospitalId + ", patientName=" + patientName + ", patientage="
					+ patientage + ", bloodgroup=" + bloodgroup + "]";
		}
		public BloodRequirement() {
			super();
			// TODO Auto-generated constructor stub
		}
}
