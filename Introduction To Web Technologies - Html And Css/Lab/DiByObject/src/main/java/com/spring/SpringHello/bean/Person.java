package com.spring.SpringHello.bean;

public class Person {

	private String pname;
	private Phone phone;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public void cellPhone() 
	{
		System.out.println("Calling .....................................");
		phone.call();
	}
}
