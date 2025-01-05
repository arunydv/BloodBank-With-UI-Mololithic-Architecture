package com.blood.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	@Column(length = 10)
	private String id;
	@Column(length = 10,nullable = false)
	private String name;
	@Column(length = 3,nullable = false)
	private String bloodgroup;
	@Column(nullable = false)
	private Date admission;
	@Column(nullable = false)
	private Date discharge;
	@Column(nullable = false, columnDefinition = "INT(2)")
	private int age;
	@Column(length = 25,nullable = false)
	private String address;
	@Column(nullable = false)
	private Date dob;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public Date getAdmission() {
		return admission;
	}
	public void setAdmission(Date admission) {
		this.admission = admission;
	}
	public Date getDischarge() {
		return discharge;
	}
	public void setDischarge(Date discharge) {
		this.discharge = discharge;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String id, String name, String bloodgroup, Date admission, Date discharge, int age, String address,
			Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.bloodgroup = bloodgroup;
		this.admission = admission;
		this.discharge = discharge;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", bloodgroup=" + bloodgroup + ", admission=" + admission
				+ ", discharge=" + discharge + ", age=" + age + ", address=" + address + ", dob=" + dob + "]";
	}
}
