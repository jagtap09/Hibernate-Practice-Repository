package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentCreate;


public class StudentCreateMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(StudentCreate.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		StudentCreate s =new StudentCreate ();
		s.setStud_id(1);
		s.setName("Piyush");
		s.setAge(30);
		s.setCity("Pune");
		
		ss.persist(s);
		
		StudentCreate s1 =new StudentCreate ();
		s1.setStud_id(2);
		s1.setName("Kiyush");
		s1.setAge(29);
		s1.setCity("Mumbai");
		
		ss.persist(s1);
		
		StudentCreate s2 =new StudentCreate ();
		s2.setStud_id(3);
		s2.setName("miyara");
		s2.setAge(20);
		s2.setCity("Nashik");
		
		ss.persist(s2);
		
		tr.commit();
		ss.close();
		
	    System.out.println("Application started..");
	 	
		
	
	
	
	
	
	
	
	}

}
