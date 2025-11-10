package com.practice;

interface D1
{
	int no=45;
	static void getData()
	{
		System.out.println(" Roll Number:" +no);
		System.out.println("Interface Part 1 Method getData called");
	}
	abstract void fact(int no);
}
interface D2 extends D1
{
	String name="Pintu";
	static void putData()
	{
		System.out.println("Name:" +name);
		System.out.println("Interface Part 2 Method putData called");
	}
	abstract void even(int no);
}

class Wel implements D2{

	public void fact(int no) {
	
	     int fact =1;
	     for(int i=1;i<=no;i++)
	     {
	    	 fact=fact*i;
	     }
	     System.out.println("Factorial Number:" + fact);
	}

	public void even(int no) {
	
		if(no%2==0)
		{
			System.out.println("Even Number:" + no);
		}
		else
		{
			System.out.println("Odd Number:" + no);
		}
		
	}
	
}
public class Interface_Data {
 
	public static void main(String[] args) {
		
		Wel w1 = new Wel();
		D1.getData();
		D2.putData();
		w1.fact(5);
		w1.even(12);
	}
}
