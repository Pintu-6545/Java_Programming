package com.practice;

class Over
{
	   int rno;
       String name;  
	   
	   public void show()
	   {
		   int rno=25; 
		   System.out.println("Roll Number:" + rno);

	  }
	   
	   public void show(int rno)
	   {
		 rno=rno;
		 long zipcode=636312;
		 System.out.println("Roll Number:"+rno);
		 System.out.println("Zipcode:" +zipcode);
	   }
	   public void show(int rno, String name, String address)
	   {
		   rno=rno;
		   name=name;
		   System.out.println("Roll Number:"+rno);
		   System.out.println("Name:"+name);
		   System.out.println("Address:" +address);
	   }
}
public class Method_Overloading {
  
	public static void main(String[] args) {
		
		Over o1 = new Over();
		o1.show();
		o1.show(14);
		o1.show(63, "Pintu", "Vastral");
	}
}
