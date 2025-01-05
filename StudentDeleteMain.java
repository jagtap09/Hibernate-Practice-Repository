package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentCreate;

public class StudentDeleteMain {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(StudentCreate.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int stud_id=2;
		StudentCreate d=ss.get(StudentCreate.class, stud_id);
		
		ss.delete(d);
		System.out.println(d);
		tr.commit();
		ss.close();
		sf.close();
		
	}

}
