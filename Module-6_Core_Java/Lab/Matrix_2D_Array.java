package com.practice;

import java.util.Scanner;

public class Matrix_2D_Array {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number1 Value:");
	int no1=sc.nextInt();
	System.out.println("Enter the  Number2 Value: ");
	int no2=sc.nextInt();
	int a[][] = new int[no1][no2];
	int b[][] = new int[no1][no2];
	int add[][] = new int[no1][no2];
	int sub[][] = new int[no1][no2];
	
	for(int i=0;i<no1;i++)
	{
		for(int j=0;j<no2;j++)
		{
			System.out.println("Enter the Array First Natrix Value:");
			a[i][j]=sc.nextInt();
		}
	} 
	for(int i=0;i<no1;i++)
	{
		for(int j=0;j<no2;j++)
		{
			System.out.println("Enter the Second Natrix Value:");
			b[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<no1;i++)
	{
		for(int j=0;j<no2;j++)
		{
		
			add[i][j]=a[i][j]+b[i][j];
			sub[i][j]=a[i][j]-a[j][j];
		}
	}
	System.out.println("Addtion Matrix");
	for(int i=0;i<no1;i++)
	{
		for(int j=0;j<no2;j++)
		{
			System.out.print(" " + add[i][j]);		
			}
		System.out.println();
	}
	System.out.println("Subtraction Matrix:");
	for(int i=0;i<no1;i++)
	{
		for(int j=0;j<no2;j++)
		{
			System.out.print(" " + sub[i][j]);		
			}
		System.out.println();
	}
	
	
}
}
