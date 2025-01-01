package com.blood.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hospital {

	@Id
	@Column(length = 10)
	private String Id;
	@Column(length = 25)
	private String name;
	@Column(length = 25)
	private String address;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	public Hospital(String id, String name, String address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hospital [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
}
