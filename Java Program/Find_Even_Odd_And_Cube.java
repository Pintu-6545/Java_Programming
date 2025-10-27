package com.core;

import java.util.Scanner;

public class Find_Even_Odd_And_Cube {
  public static void main(String[] args) {
	
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int no=sc.nextInt();
	  int d=no*no*no;
	  if(d%2==0)
	  {
		  System.out.println("Even Number:" + d);
		  System.out.println("Cube:" + d);
	  }
	  else
	  {
		  System.out.println("Odd Number:" + d);
		  System.out.println("Cube:" + d);
	  }
	  
}
}
