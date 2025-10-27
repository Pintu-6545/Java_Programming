package com.core;

class Social
{
	int no=45;
	 public void show()
	 {
		 if(no%2==0)
		 {
			 System.out.println("Even Number:" + no);
		 }
		 else
		 {
			 System.out.println("Odd Number:" + no);
		 }
	 }
}
class Political extends Social
{
	  int no=5;
	  public void show1()
	  {
		  int c=no*no*no;
		  int s=no*no;
		  System.out.println("Square:" + s);
		  System.out.println("Cube:" + c);
	  }
}
public class Inheritance {
public static void main(String[] args) {
	  Political p1 = new Political();
	  p1.show();
	  p1.show1();
}
}
