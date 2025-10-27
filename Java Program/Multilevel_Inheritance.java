package com.core;
class A
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
class B extends A
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
class C extends B
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
public class Multilevel_Inheritance {
 public static void main(String[] args) {
	
	 C c1 = new C();
	 c1.display();
	 c1.facto();
	 c1.patter();
}
}
