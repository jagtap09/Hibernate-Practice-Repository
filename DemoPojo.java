package com.demopojo;

public class DemoPojo {
	
	// This is the POJO class 
	
	private int id;
	private String name;
	private String address;
	
	
	// getter  and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	// TOstring method
	@Override
	public String toString() {
		return "DemoPojo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	// no argument Constructor
	
	public DemoPojo() {
		
	}
	
	
	// argument Constructor
	
	public DemoPojo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
	
	
	
	
	

}
