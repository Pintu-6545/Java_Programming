package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.bean.Employee_info;
import com.dao.EmployeeDao;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			Employee_info einfo = new Employee_info();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setEmail(request.getParameter("email"));
			
			EmployeeDao.insertEmployeeInfo(einfo);
			
			Employee e = new Employee();
			e.setJob(request.getParameter("job"));
			e.setLoc(request.getParameter("loc"));
			e.setDid(Integer.parseInt(request.getParameter("did")));
			e.setEinfo(einfo);
			
			EmployeeDao.insertEmployee(e);
			response.sendRedirect("employeeInfo.jsp");
		}
	
	}

}
