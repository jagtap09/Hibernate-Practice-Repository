package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employe;

public class EmployeMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employe.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employe e= new Employe();
		e.setEmolye_id(1);
		e.setName("Riya");
		e.setCity("Pune");
		e.setPhone(7889564512L);
		
		ss.persist(e);
		tr.commit();
		
		
		
		
	}

}
