package com.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.EmployeCreate;

public class EmployeeCreateMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeCreate.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		 /*EmployeCreate e= new EmployeCreate();
		e.setEmolye_id(1);
		e.setName("Riya");
		e.setCity("Pune");
		e.setPhone(7889564512L);
		ss.persist(e); 
	*/
		EmployeCreate e1= new EmployeCreate();
		e1.setEmolye_id(2);
		e1.setName("siya");
		e1.setCity("Panvel");
		e1.setAge(29);
		e1.setPhone(784526512L);
		ss.persist(e1);
		
		EmployeCreate e2= new EmployeCreate();
		e2.setEmolye_id(3);
		e2.setName("miya");
		e2.setCity("mumbai");
		e2.setPhone(965689475L);
		e2.setAge(23);
		ss.persist(e2);
		
		
		
		
		
		
		
		tr.commit();
		
		
		
		
	}

}
