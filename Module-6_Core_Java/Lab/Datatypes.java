package com.practice;

import java.util.Scanner;

public class Datatypes {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	    // String Dataytype
		 System.out.println("Enter the Name:");
		 String name=sc.nextLine();	  
	  
	  // Integer Datatype 
	  System.out.println("Enter the Roll:");
	  int no=sc.nextInt();
	  
	  // Long Dataytpe
	  System.out.println("Enter the Mobile:");
	  long mobile = sc.nextLong();
	  
	  // Flaot Datatype
	  System.out.println("Enter the Percentage:");
	  float per =sc.nextFloat();
	  
	  // Double Datatype
	  System.out.println("Enter the Decimal Value:");
	  double d=sc.nextDouble();
	  
	  System.out.println("Name:" +name);
	  System.out.println("Roll Number:" +no);
	  System.out.println("Mobile:" +mobile);
	  System.out.println("Percentage:" +per);
	  System.out.println("Decimal Value:" +no);
	  
}

}
