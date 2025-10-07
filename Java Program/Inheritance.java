package core.java;

import java.util.Scanner;

class A {
	          int rno;
	         void getA()
	         {
	        	 Scanner sc =new Scanner(System.in);
	        	 System.out.println("Enter the Roll Number:");
	        	 rno=sc.nextInt();  	 
	         }
	         void putA()
	         {
	        	 System.out.println("Roll No:" +rno);
	         }
}
class B extends A {
	        String name;
	        void getB()
	        {
	        	Scanner sc=new Scanner(System.in);
	        	System.out.println("Enter the Name:");
	        	name=sc.nextLine();
	        }
	        void putB()
	        {
	        	System.out.println("Student Name:" +name);
	        }
}
class C extends A
{
	      long salary;
	      void getC()
	      {
	    	  Scanner sc =new Scanner(System.in);
	    	  System.out.println("Enter the Salary:");
	    	  salary=sc.nextLong();
	      }
	      void putC()
	      {
	    	  System.out.println("Salary:" +salary);
	      }
}
public class Inheritance {
	public static void main(String[] args) {
		B b1 =new B();
		b1.getA();
		b1.getB();
		C c1 =new C();
		c1.getA();
		c1.getC();
		c1.putA();
		b1.putB();
		c1.putC();
	}

}
