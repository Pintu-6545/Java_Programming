package com.core;

class Demo2
{
	public Demo2()
	{
		System.out.println(" Parent Default Constructor is Called");
	}
}
class Demo3 extends Demo2
{
	public Demo3()
	{
		System.out.println("Child Class Default Constructor is Called");
	}
}
class Demo4 extends Demo3
{
	public Demo4()
	{
		System.out.println("Derived Class Default Constructor is Called");
	}
}
public class Constructor_Chenneing {
     public static void main(String[] args) {
		Demo2  d1 = new Demo2();
		Demo3 d2 = new Demo3();
		Demo4 d3 = new Demo4();
	}
}
