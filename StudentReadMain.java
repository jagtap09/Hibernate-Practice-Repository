package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentCreate;

public class StudentReadMain {
	public static void main(String[] args) {
		 // building the configuration 
				
				Configuration cfg=new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(StudentCreate.class);
				SessionFactory sf= cfg.buildSessionFactory();
				Session  ss= sf.openSession();
				Transaction tr= ss.beginTransaction();
				
				// fetch department by id 
				int  stud_id=1;
				StudentCreate d=ss.get(StudentCreate.class,stud_id);
				
				System.out.println("StudentDetails:"+ d);
				
				tr.commit();
				ss.close();
				sf.close();
				
			}

		}


