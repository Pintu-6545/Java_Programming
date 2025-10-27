package com.core;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		
	//	System.out.println("Welcome to First Program in Java");
		
	    Scanner sc = new Scanner(System.in);
//	    int a=10;
//	    int b=20;
//	    int sum=a+b;
//	    int sub=a-b;
//	    int multi=a*b;
//	    int div=a/b;
//	    System.out.println("Addition:" + sum);
//	    System.out.println("Subtraction:" + sub);
//	    System.out.println("Multiplication:" + multi);
//	    System.out.println("Division:" + div);
	    
	    System.out.println("Enter the Number1:");
	    int no1=sc.nextInt();
	    System.out.println("Enter the Number2:");
	    int no2=sc.nextInt();
	    int sum=no1+no2;
	    int sub=no1-no2;
	    int multi=no1*no2;
	    int div=no1/no2;
	    System.out.println("Addition:" + sum);
	    System.out.println("Subtraction:" + sub);
	    System.out.println("Multiplication:" + multi);
	    System.out.println("Divison:" + div);
	    }	
	
 }
