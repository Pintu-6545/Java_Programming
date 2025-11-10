package com.practice;

class Demo
{
	 int id;
	    String name;
	    int age;

	    // Default Constructor
	    Demo() {
	        id = 0;
	        name = "Unknown";
	        age = 18;
	        System.out.println("Default Constructor Called");
	    }

	    // Parameterized Constructor - 1
	    Demo(int i, String n) {
	        id = i;
	        name = n;
	        age = 18;
	        System.out.println("Constructor with 2 parameters Called");
	    }

	    // Parameterized Constructor - 2 (Overloaded)
	    Demo(int i, String n, int a) {
	        id = i;
	        name = n;
	        age = a;
	        System.out.println("Constructor with 3 parameters Called");
	    }

	    // Display Method
	    void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	    }
}
public class Constructor_Overloading {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(25,"Pintu");
		Demo d3 = new Demo(23,"Kajal",36);
		d1.display();
		d2.display();
		d3.display();
	}

}
