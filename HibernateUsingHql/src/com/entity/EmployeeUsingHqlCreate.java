package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class EmployeeUsingHqlCreate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto-generation ID values 

	private int emp_id;
	private String name;
	private int age;
	private  String department;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public EmployeeUsingHqlCreate(int emp_id, String name, int age, String department) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public EmployeeUsingHqlCreate() {
		
	}
	
	
	@Override
	public String toString() {
		return "EmployeeUsingHql [emp_id=" + emp_id + ", name=" + name + ", age=" + age + ", department=" + department
				+ "]";
	}
	
	
	
	
	

}
