package com.annotation;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Department_Record")
public class Department {

	@Id // marks this field as the primary  key 
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto-generation ID values 
	int deptid;
	@Column(name="depart_name")
	String deptname;

	// getter and setter
	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	// toString
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}

	// parameterized constructor
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	// no argument
	public Department() {

	}

}
