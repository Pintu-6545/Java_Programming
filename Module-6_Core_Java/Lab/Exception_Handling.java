package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		
		System.out.println("Start Code:");
		int a ,b,c;
		Scanner sc =new Scanner(System.in);
		try
		{
		System.out.println("Enter the A:");
		a=sc.nextInt();
		System.out.println("Enter the B:");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division:" + c);
		int ar[]= {10,20,30,40,50};
		
	    System.out.println("Enter the Index:");
	    int index =sc.nextInt();
	    System.out.println("The Value:" + index +"=" + ar[index]);
		}
		catch(ArithmeticException e)
		{
				System.out.println("Dive by Zero not Allow" + e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter Only Numeric Value:" + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Not Found:" + e.getMessage());
		}
		
 	}
}
