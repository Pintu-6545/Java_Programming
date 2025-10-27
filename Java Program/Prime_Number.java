package com.core;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no=sc.nextInt();
		int i;
		for( i=2;i<=no;i++)
		{
			if(no%i==0)
			{
				break;
			}
		}
		if(no==i)
		{
			System.out.println("Prime Number:" +i);
		}
		else
		{
			System.out.println("Not Prime Number:" +i);
		}
		
				
	}
}
