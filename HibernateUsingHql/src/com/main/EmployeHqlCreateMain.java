package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.EmployeeUsingHqlCreate;

public class EmployeHqlCreateMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeUsingHqlCreate.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		// HQL insert to add data into employeeUsingHql
		String hqlInsert="insert into EmployeeUsingHql (name,age,department) values (:name , :age ,:department)";
		Query<EmployeeUsingHqlCreate> query1= ss.createQuery(hqlInsert);
		
		// setting values for the place holders
		query1.setParameter("name","siya");
		query1.setParameter("age",25);
		query1.setParameter("department", "HR");
		
		// execute the insert query 
		int result =query1.executeUpdate();
		System.out.println("data inseted.."+result);
		
        // Commit the transaction

		tr.commit();

		ss.close();
		sf.close();
																				
										
									}
	}


