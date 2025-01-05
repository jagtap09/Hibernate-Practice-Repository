package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.EmployeCreate;

public class EmployeeReadMain {
	public static void main(String[] args) {
 // building the configuration 
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeCreate.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session  ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		// fetch department by id 
		int  deptid=1;
		EmployeCreate d=ss.get(EmployeCreate.class,deptid);
		
		System.out.println("Department Details:"+ d);
		
		tr.commit();
		ss.close();
		sf.close();
		
	}

}
