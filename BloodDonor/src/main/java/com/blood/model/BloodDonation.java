package com.blood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BloodDonation {

	@Id
	@Column(length = 10, nullable =false)
	private String donorId;
	@Column(length = 10, nullable =false)
	private String pname;
	@Column(length = 10, nullable =false)
	private String hospId;
	@Column(length = 3, nullable =false)
	private String bloodgrp;
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getHospId() {
		return hospId;
	}
	public void setHospId(String hospId) {
		this.hospId = hospId;
	}
	public String getBloodgrp() {
		return bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}
	public BloodDonation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodDonation(String donorId, String pname, String hospId, String bloodgrp) {
		super();
		this.donorId = donorId;
		this.pname = pname;
		this.hospId = hospId;
		this.bloodgrp = bloodgrp;
	}
	@Override
	public String toString() {
		return "BloodDonation [donorId=" + donorId + ", pname=" + pname + ", hospId=" + hospId + ", bloodgrp="
				+ bloodgrp + "]";
	}
}
