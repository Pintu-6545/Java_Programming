package com.core;

import java.util.Scanner;

public class Positive_Number {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int no=sc.nextInt();
	  int sum=0;
	  while(no>0)
	  {
		  sum=sum+no;
		  System.out.println("Tops Tetchnologies:"+no);
		  no--;
	  }
	  System.out.println("Sum:" + sum);
	
	  
	  }
}
