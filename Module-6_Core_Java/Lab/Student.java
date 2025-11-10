package com.practice;

import java.util.Scanner;

public class Student {

	   String name;
	   int age;
	   
	      public void display()
	      {
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.println("Enter the Name:");
	    	  name=sc.nextLine();
	    	  System.out.println("Enter the Age:");
	    	  age=sc.nextInt();
	          
	    	  System.out.println("Name:" + name);
	    	  System.out.println("Age:" +age);
	      }
	  public static void main(String[] args) {
		
		  Student s1 = new Student();
		  s1.display();
	}
}
