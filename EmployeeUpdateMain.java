package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.EmployeCreate;

public class EmployeeUpdateMain { 
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeCreate.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int emloye_id=1;
		EmployeCreate d=ss.get(EmployeCreate.class, emloye_id);
		d.setAge(26);
		
		ss.update(d);
		System.out.println(d);
		tr.commit();
		ss.close();
		sf.close();
	}

}
