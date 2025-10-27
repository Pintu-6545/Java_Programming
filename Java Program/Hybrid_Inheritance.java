package com.hybrid;
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
class D extends C
{
	    void  Array_Data()
	    {
	    	  int ar[] = {10,20,30,40,50,60};
	    	  for(int i=0;i<ar.length;i++)
	    	  {
	    		  System.out.println("Array Value:[" + i + "]:" + ar[i]);
	    	  }
	    	  System.out.println("Reverse Array Print");
	    	  for(int i= ar.length-1;i>=0;i--)
	    	  {
	    		  System.out.println("Array Value:[" + i + "]:" + ar[i]);
	    	  }
	    }
}
class E extends C
{
	   void rev_pattern()
	   {
		   for(int i=8;i>=1;i--)
		   {
			   for(int j=1;j<=i;j++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
	   }
}
public class Hybrid_Inheritance {
public static void main(String[] args) {
	D d1 = new D();
	d1.display();
	d1.facto();
	d1.patter();
    d1.Array_Data();
	E e1 = new E();
	e1.display();
	e1.facto();
	e1.patter();
	e1.rev_pattern();
}
}
