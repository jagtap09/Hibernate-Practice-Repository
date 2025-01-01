package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
	
	@Id
	private int emolye_id;
	private String name;
	private int age;
	private String city;
	private long phone;
	
	// getter and setter 
	public int getEmolye_id() {
		return emolye_id;
	}
	public void setEmolye_id(int emolye_id) {
		this.emolye_id = emolye_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	// to String methods 
	@Override
	public String toString() {
		return "employee [emolye_id=" + emolye_id + ", name=" + name + ", age=" + age + ", city=" + city + ", phone="
				+ phone + "]";
	}
	
 // no argument constructor 

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	argument constructor

public Employe(int emolye_id, String name, int age, String city, int phone) {
	super();
	this.emolye_id = emolye_id;
	this.name = name;
	this.age = age;
	this.city = city;
	this.phone = phone;
}
	
	
	
	
}
