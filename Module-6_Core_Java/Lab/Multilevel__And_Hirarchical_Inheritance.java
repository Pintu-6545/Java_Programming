package com.practice;

import java.util.Scanner;

// Mulitilevel Ineheritance 
class V
{
	  int no=2;
	  void display()
	  {
		  int i;
		  for(i=2;i<=no;i++)
		  {
			  if(no%i==0)
			  {
				  break;
			  }
		  }
		  if(no==i)
		  {
			  System.out.println("Prime Number:" + no);
		  }
		  else
		  {
			  System.out.println("Not Prime Number:" + no);
		  }
	  }
}
class K extends V
{
	     int no=5;
	     void facto()
	     {
	    	 int fact=1;
	    	 for(int i = 1;i<=no;i++)
	    	 {
	    		 fact=fact*i;
	    	 }
	    	 System.out.println("Factorial Number:" + fact);
	     }
}
class M extends K
{
	    void patter()
	    {
	    	for(int i=1;i<=8;i++)
	    	{
	    		for(int j=1;j<=i;j++)
	    		{
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
}

// Herarchical Inheritance

class P extends M
{
	int no=12;
	void EvenOdd()
	{
		if(no%2==0)
		{
			System.out.println("Even Number:"+no);
		}
		else
		{
			System.out.println("Odd Number:"+no);
		}
	}
	
}
class Z extends M
{
	int no=20;
	int no1=10;
	void arithmatic()
	{
		int add=no+no1;
		int sub=no-no1;
		int multi=no-no1;
		int div=no/no1;
		System.out.println("Addition:"+add);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+multi);
		System.out.println("Division:"+div);
	}
}
public class Multilevel__And_Hirarchical_Inheritance {
 public static void main(String[] args) {
	
	 M c1 = new M();
	 c1.display();
	 c1.facto();
	 c1.patter();
	 
	 P p1 =new P();
	 p1.display();
	 p1.facto();
	 p1.patter();	 
	 p1.EvenOdd();
	 
	 Z z1 = new Z();
	 z1.display();
	 z1.facto();
	 z1.patter();
	 z1.arithmatic();
}
}
