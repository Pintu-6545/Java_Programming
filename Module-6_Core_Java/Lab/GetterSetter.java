package com.practice;


class Employee 
{
	private int id;
	private String fname,lname,email,address,city,state;
	private long mobile,zipcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
public class GetterSetter {
	
	public static void main(String[] args) {
		
	     Employee e1 = new Employee();
	     e1.setId(1);
	     e1.setFname("Pntu");
	     e1.setLname("Ghanchi");
	     e1.setEmail("vasu45@gmail.com");
	     e1.setMobile(984745631);
	     e1.setCity("Sirohi");
	     e1.setState("Gujarat");
	     e1.setZipcode(653645);
	     
	     System.out.println("EMP_ID:" + e1.getId());
	     System.out.println("NAME:" + e1.getFname());
	     System.out.println("Email:" + e1.getEmail());
	     System.out.println("Mobile:" + e1.getMobile());
	     System.out.println("City:" + e1.getCity());
	     System.out.println("State:" + e1.getState());
	     System.out.println("Zipcode:" + e1.getZipcode());
		
	}

}
