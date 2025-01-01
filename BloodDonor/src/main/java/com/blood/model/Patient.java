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
	@Column(length = 25,nullable = false)
	private String name;
	@Column(length = 2,nullable = false)
	private String blood_group;
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
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
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
	public Patient(String id, String name, String blood_group, Date admission, Date discharge, int age, String address,
			Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.blood_group = blood_group;
		this.admission = admission;
		this.discharge = discharge;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", blood_group=" + blood_group + ", admission=" + admission
				+ ", discharge=" + discharge + ", age=" + age + ", address=" + address + ", dob=" + dob + "]";
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
}
