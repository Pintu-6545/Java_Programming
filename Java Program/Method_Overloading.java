package com.core;

class Demo1
{
	    int no;
	      void show()
	      {
	    	  System.out.println("Default Method without arguments:");
	      }
	      void show(int no1)
	      {
	    	  no=no1;
	    	  if(no%2==0)
	    	  {
	    		  System.out.println("Even Number:"+no);
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Odd Number:" + no);
	    	  }
	      }
	      void show(int no1,int no2)
	      {
	    	  int sum=no1+no2;
	    	  System.out.println("Addition:"+sum);
	      }
}
public class Method_Overloading {
   public static void main(String[] args) {
	
	   Demo1 d1 = new Demo1();
	   d1.show();
	   d1.show(12);
	   d1.show(12,45);
}
}
