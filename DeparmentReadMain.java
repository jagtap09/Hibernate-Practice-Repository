package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.DepartmentCreate;

public class DeparmentReadMain {

	public static void main(String[] args) {
		 // building the configuration 
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(DepartmentCreate.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session  ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		// fetch department by id 
		int  deptid=1;
		DepartmentCreate d=ss.get(DepartmentCreate.class,deptid);
		
		System.out.println("Department Details:"+ d);
		
		tr.commit();
		ss.close();
		sf.close();
		
		
		
		
	}

}
