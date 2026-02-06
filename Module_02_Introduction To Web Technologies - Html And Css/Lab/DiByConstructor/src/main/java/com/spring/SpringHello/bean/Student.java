package com.spring.SpringHello.bean;

public class Student {

	private int id;
	private String fname,lname,email;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String fname, String lname, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	
	public void init()
	{
		System.out.println("Beans Initialized ");
	}
	public void destroy()
	{
		System.out.println("Beans Destroyed");
	}
}
