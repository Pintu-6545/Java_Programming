package com.practice;

import java.util.Scanner;

abstract class Data
{
	  int rno=14;
	  void display()
	  {
		  System.out.println("Roll Number:" + rno);
	  }
	  
	  abstract void student();
	  abstract void  viewStudnet();
}
class Demo1 extends Data
{
	String name;
	void student() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		name=sc.nextLine();
	}
	void viewStudnet() {
			System.out.println("Name:" + name);
	}

}
public class Abstruct_Class {
public static void main(String[] args) {
	
	Demo1 d1 = new Demo1();
	d1.display();
	d1.student();
	d1.viewStudnet();
}
}
