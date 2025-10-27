package com.core;

import java.util.Scanner;

public class UserDefineArray {
  
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Array Value:");
		int no=sc.nextInt();
		int ar[] = new int[no];
		int sum=0;
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Array Value");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<no;i++)
		{
			System.out.println("Array Value:[" + i +"]" + ":" +ar[i]);
		}
		
		for(int i=0;i<no;i++)
		{
			sum+=ar[i];
		}
		System.out.println("Sum of Array:" + sum);
		
	}
}
