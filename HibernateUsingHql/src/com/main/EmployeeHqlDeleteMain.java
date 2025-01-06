package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.EmployeeUsingHqlCreate;

public class EmployeeHqlDeleteMain {

	public static void main(String[] args) {
		// Configure Hibernate and build session factory
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(EmployeeUsingHqlCreate.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
        // HQL Delete Query
        String hqlDelete = "delete from EmployeeUsingHqlCreate where emp_id = :empId";
        Query query = ss.createQuery(hqlDelete);
        
        // Setting value for the placeholder
        query.setParameter("empId", 4); // Replace '1' with the ID of the employee you want to delete
        
        // Execute the delete query
        int result = query.executeUpdate();
        System.out.println("Rows affected: " + result);
        
        // Commit the transaction
        tr.commit();
        
        // Close the session
        ss.close();
        sf.close();
	}

}
