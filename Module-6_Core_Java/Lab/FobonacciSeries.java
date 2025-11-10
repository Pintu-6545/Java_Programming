package com.practice;

import java.util.Scanner;

public class FobonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,no,num=0,num1=1,nexttemp;
		System.out.println("Enter the Number of Fibbonacci Series:"); 
        no=sc.nextInt();
        System.out.println("Fibbonacci Series:");

		for(i=1;i<=no;i++)
		{
			System.out.print(" " + num);
			 nexttemp = num + num1;
			 num = num1;
			 num1 = nexttemp;

		}
		System.out.println();
	}

}
