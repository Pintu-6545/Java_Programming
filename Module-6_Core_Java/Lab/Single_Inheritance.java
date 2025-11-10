package com.practice;

import java.util.Scanner;

class A
{
	int rno;
	  public void setData()
	  {

		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Roll Number:");
		  rno=sc.nextInt();
	  }
	  public void getData()
	  {
		  System.out.println("Roll Number:"+rno);
	  }
}
class B extends A
{
	  String name;
	  public void setData1()
	  {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Name:");
		 name=sc.nextLine();
	  }
	  public void getData1()
	  {
		  System.out.println("Name:"+name);
	  }
}
public class Single_Inheritance {
 
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.setData();
		b1.setData1();
		b1.getData();
		b1.getData1();
	}
}
