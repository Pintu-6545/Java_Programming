package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class Employee_info {

	private int epid;
	private String fname,lname,email;
	private Employee e;
	public int getEid() {
		return epid;
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public void setEid(int eid) {
		this.epid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "einfo")
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	
}
