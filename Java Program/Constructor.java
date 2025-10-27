package com.core;

class Demo
{
	   
	    double width,height,depth;
		Demo()
	    {
	    	System.out.println("Default Constructor is Called");
	    	double width=3;
	    	double height=5;
	    	double depth=4;
	    }
		Demo(double w,double h, double d)
		{
			System.out.println("Parameterized Constructor Called:");
			width=w;
			height=h;
			depth=d;
		}
		Demo(Demo d)
		{
			width=d.width;
			height=d.height;
			depth=d.depth;
		}
	    void display()
	    {
	    	System.out.println("Volume:" + (width*height*depth));
	    }
	    
}
public class Constructor {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.display();
		Demo d2 = new Demo(4,5,5);
		d2.display();
		Demo d3 = new Demo(d2);
		d3.display();
	}
	
}
