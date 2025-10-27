package com.core;
class P
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
class K extends P
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
class J extends P
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
 public class Hirarchical_Inheritance {

	 public static void main(String[] args) {
			
		 J j1 = new J();
		 K k1 = new K();
		 k1.display();
		 k1.facto();
		 j1.display();
		 j1.patter();
	}

}
