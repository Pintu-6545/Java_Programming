package com.practice;

public class Static_Method {
	 static int wel=10;
	   static int d=20;
	  static void  getData(int c,int d)
	  {
		  wel=c;
		  d=d;
		  
	  }
	  static void putData()
	  {
	      System.out.println("Wel:Show:" + wel);
	      System.out.println("D:Show:" + d);
	  }
	  
	  public static void main(String[] args) {
		
		  getData(10,20);
		  putData();
	}
}
