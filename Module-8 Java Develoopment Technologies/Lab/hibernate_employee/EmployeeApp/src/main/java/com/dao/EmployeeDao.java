package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.Employee_info;
import com.util.EmployeeUtil;

public class EmployeeDao {
	
	public static void insertEmployeeInfo(Employee_info e)
	{
		Session session= EmployeeUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static void insertEmployee(Employee e)
	{
		Session session= EmployeeUtil.createSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}

}
