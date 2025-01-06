package com.main;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.EmployeeUsingHqlCreate;

public class EmployeeHqlGetParticularData {

	public static void main(String[] args) {
		// building connection
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeUsingHqlCreate.class);
		
		// session factory interface
		SessionFactory sf=cfg.buildSessionFactory();
		// session for connecting 
		Session ss=sf.openSession();
		
        Transaction tr = ss.beginTransaction();

		
		// Fetching particular record
        String hqlQuery = "from EmployeeUsingHqlCreate where emp_id = :emp_id";
        Query<EmployeeUsingHqlCreate> query = ss.createQuery(hqlQuery, EmployeeUsingHqlCreate.class);
        query.setParameter("emp_id", 1); // Setting the parameter
        
        EmployeeUsingHqlCreate e= query.getSingleResult();
        System.out.println(e);
		
	}

}
