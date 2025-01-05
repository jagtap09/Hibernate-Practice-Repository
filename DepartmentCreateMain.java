package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.DepartmentCreate;
public class DepartmentCreateMain {

	public static void main(String[] args) {			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml") ;
			cfg.addAnnotatedClass(DepartmentCreate.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tr=ss.beginTransaction();
			
			DepartmentCreate d=new DepartmentCreate();
			d.setDeptid(1);
			d.setDeptname("HR");
			d.setCity("pune");
			d.setAge(27);
			ss.persist(d); // save first record 
			System.out.println(d);
			
			DepartmentCreate d1= new DepartmentCreate();
			d1.setDeptid(2);
			d1.setDeptname("Finance");
			d1.setCity("mumbai");
			d1.setAge(30);
			ss.persist(d1); // save 2nd record 
			
			DepartmentCreate d2 = new DepartmentCreate();
	        d2.setDeptid(3);
	        d2.setDeptname("Finance");
	        d2.setCity("Mumbai");
	        d2.setAge(30);
	        
	        ss.persist(d2); // Save 3rd record

	        DepartmentCreate d3 = new DepartmentCreate();
	        d3.setDeptid(4);
	        d3.setDeptname("IT");
	        d3.setCity("Bangalore");
	        d3.setAge(25);
	        ss.persist(d3); // save 4th record
	        System.out.println("Inserted multiple records successfully...");

			tr.commit();
			
			ss.close();
			sf.close();
			
			
		}
	}


