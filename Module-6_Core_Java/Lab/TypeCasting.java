package com.practice;

public class TypeCasting {
	public static void main(String[] args) {
		
		// Implicit Typecasting
		int no=2500;
		double data = no; //  int → double (automatic conversion)
		
	System.out.println("Integer Value:" + no);
	System.out.println("Double Value:" + data);
	
	// Explicit Typecasting
	
	     double num=98.36;
	     int data1 = (int) num;  // double → int (manual casting)
	     
	     System.out.println("Double value: " + num);
	        System.out.println("Integer value after casting: " + data1);
	}

}
