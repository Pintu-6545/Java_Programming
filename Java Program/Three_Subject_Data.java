package com.core;

import java.util.Scanner;

public class Three_Subject_Data {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Subject1:");
	 int s1=sc.nextInt();
	 System.out.println("Enter the Subject2:");
	 int s2=sc.nextInt();
	 System.out.println("Enter the Subject3:");
	 int s3=sc.nextInt();
	 int total=0;
	 int z;
	 if(s1==s2 || s2==s3)
	 {
		 total=s1+s2 +s3;
		 z=total=0;
		 System.out.println("Two Number are Equval By Zero:" + z);
	 }  
	 else
	 {
		 total=s1+s2+s3;
		 System.out.println("Total Three Number:" + total);
	 }
}
}
