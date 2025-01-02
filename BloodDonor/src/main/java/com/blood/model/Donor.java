package com.blood.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Donor {

	@Id
	@Column(length = 25)
	private String donorId;
	@Column(length = 100,nullable = false)
	private String password;
	@Column(length = 25,nullable = false)
	private String firstname;
	@Column(length = 25,nullable = false)
	private String lastname;
	@Column(nullable = false)	
	private Date dob;
	@Column(length = 25,nullable = false)
	private String address;
	@Column(nullable = false)
	private long contact;
	@Column(length = 3,nullable = false)
	private String blood;
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return firstname;
	}
	public void setFirst_name(String first_name) {
		this.firstname = first_name;
	}
	public String getLast_name() {
		return lastname;
	}
	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getBlood_group() {
		return blood;
	}
	public void setBlood_group(String blood_group) {
		this.blood = blood_group;
	}
	public Donor(String donorId, String password, String first_name, String last_name, Date dob, String address,
			long contact, String blood_group) {
		super();
		this.donorId = donorId;
		this.password = password;
		this.firstname = first_name;
		this.lastname = last_name;
		this.dob = dob;
		this.address = address;
		this.contact = contact;
		this.blood = blood_group;
	}
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", password=" + password + ", first_name=" + firstname + ", last_name="
				+ lastname + ", dob=" + dob + ", address=" + address + ", contact=" + contact + ", blood_group="
				+ blood + "]";
	}
}
