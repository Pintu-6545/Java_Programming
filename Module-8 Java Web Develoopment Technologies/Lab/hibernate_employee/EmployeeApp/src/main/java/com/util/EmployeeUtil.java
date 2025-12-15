package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;
import com.bean.Employee_info;

public class EmployeeUtil {
	
	public static Session createSession()
	{
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(Employee_info.class)
				.addAnnotatedClass(Employee.class)
				.configure()
				.buildSessionFactory(); 
		Session session = sf.openSession();
		return session;
	}

}
