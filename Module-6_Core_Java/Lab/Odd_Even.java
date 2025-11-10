package com.practice;

import java.util.Scanner;

public class Odd_Even {
  public static void main(String[] args) {
	
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int no=sc.nextInt();
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
