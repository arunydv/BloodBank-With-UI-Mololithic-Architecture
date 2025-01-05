package com.blood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {

	@Id
	@Column(length = 10)
	private String hospId;
	@Column(length = 25,nullable = false)
	private String name;
	@Column(length = 25,nullable = false)
	private String address;
	public String getHospId() {
		return hospId;
	}
	public void setHospId(String hospId) {
		this.hospId = hospId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Hospital(String hospId, String name, String address) {
		super();
		this.hospId = hospId;
		this.name = name;
		this.address = address;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [hospId=" + hospId + ", name=" + name + ", address=" + address + "]";
	}
}