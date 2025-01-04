package com.blood.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Column(length =10, nullable = false)
	private String contact;
	@Column(length = 3,nullable = false)
	private String blood;
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob
				+ ", address=" + address + ", contact=" + contact + ", blood=" + blood + "]";
	}
	public Donor(String donorId, String firstname, String lastname, Date dob, String address, String contact,
			String blood) {
		super();
		this.donorId = donorId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.contact = contact;
		this.blood = blood;
	}
}
