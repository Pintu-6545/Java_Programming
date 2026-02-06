package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.Users;
import com.dao.UsersDao;

@WebServlet("/UsersController")
public class UsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String action = request.getParameter("action");
			//System.out.println(action);
			
			if(action.equalsIgnoreCase("insert"))
			{
			  Users u= new Users();
			  u.setUsername(request.getParameter("username"));
			  u.setEmail(request.getParameter("email"));
			  u.setPassword(request.getParameter("password"));
			  u.setMobile(Long.parseLong(request.getParameter("mobile")));
			  u.setAddress(request.getParameter("address"));
			  u.setZipcode(Long.parseLong(request.getParameter("zipcode")));
			  u.setCity(request.getParameter("city"));
			  u.setState(request.getParameter("state"));
			  UsersDao.insertUsers(u);
			  request.setAttribute("msg", "User Data Successfully Inserted...");
			  request.getRequestDispatcher("index.jsp").forward(request, response);
			 // response.sendRedirect("index.jsp");
			}
			else if(action.equalsIgnoreCase("edit"))
			{
			  int user_id = Integer.parseInt(request.getParameter("user_id"));
			  Users u = UsersDao.getUsers(user_id);
			  request.setAttribute("u", u);
			  request.getRequestDispatcher("update.jsp").forward(request, response);
			}
			else if(action.equalsIgnoreCase("update"))
			{
				Users u = new Users();
				u.setUser_id(Integer.parseInt(request.getParameter("user_id")));
				u.setUsername(request.getParameter("username"));
				u.setEmail(request.getParameter("email"));
				u.setPassword(request.getParameter("password"));
				u.setMobile(Long.parseLong(request.getParameter("mobile")));
				u.setAddress(request.getParameter("address"));
				u.setZipcode(Long.parseLong(request.getParameter("zipcode")));
				u.setCity(request.getParameter("city"));
				u.setState(request.getParameter("state"));
				UsersDao.updateUsers(u);
				response.sendRedirect("show.jsp");
			}
			else if(action.equalsIgnoreCase("delete"))
			{
				int user_id = Integer.parseInt(request.getParameter("user_id"));
				UsersDao.deleteUsers(user_id);
				response.sendRedirect("show.jsp");
			}
	}

}
