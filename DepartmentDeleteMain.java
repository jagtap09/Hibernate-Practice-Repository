package com.main;

import org.hibernate.Session;
 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.DepartmentCreate;

public class DepartmentDeleteMain {
	public static void main(String[] args) {
		
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(DepartmentCreate.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int deptid=2;
		DepartmentCreate d=ss.get(DepartmentCreate.class, deptid);
		
		ss.delete(d);
		System.out.println(d);
		tr.commit();
		ss.close();
		sf.close();
		
				
		
	}

}
