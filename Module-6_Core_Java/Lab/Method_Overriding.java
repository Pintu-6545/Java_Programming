package com.practice;
class Same
{
	String name="Pintu";
	  public void show()
	  {
		  System.out.println("Name:" + name);
	  }
}
class Vame extends Same
{
	  int rno=15;
	  public void show()
	  {
		  System.out.println("Roll" + rno);
	  }
}
class Kame extends Vame
{
	 int rno=46;
	 public void show()
	 {
		 System.out.println("Rno:"+rno);
	 }
}
public class Method_Overriding {
   public static void main(String[] args) {
	  Kame d1 = new Kame();
	  d1.show();
}
}
