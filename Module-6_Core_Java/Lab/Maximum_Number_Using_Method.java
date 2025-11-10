package com.practice;

import java.util.Scanner;

class Maximum
{
	  private int no1;
	  private int no2;
	  private int no3;
	  
	  public void display()
	  {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the Number1:");
		  no1=sc.nextInt();
		  System.out.println("Enter the Number2:");
		  no2=sc.nextInt();
		  System.out.println("Enter the Number3:");
		  no3=sc.nextInt();
		  
		  if(no1>no2 && no1>no3)
		  {
			   System.out.println("Maximum Number1:" +no1);
		  }
		  else if(no2>no1 && no2>no3)
		  {
			   System.out.println("Maximum Number2:" +no2);
		  }
		  else
		  {
			  System.out.println("Maximum Number3:" + no3);
		  }
	  }
}
public class Maximum_Number_Using_Method {

	public static void main(String[] args) {
		
		Maximum m1 = new Maximum();
		m1.display();
	}
}
