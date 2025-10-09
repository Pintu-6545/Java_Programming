package core.java;

import java.util.Scanner;

public class StaticVariable {
	static int a;
	void getData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the A:");
		a=sc.nextInt();
	}
	void putData()
	{
		System.out.println("A:Data:" + a);
	}
  public static void main(String[] args) {
	    
	  StaticVariable v1 =new StaticVariable();
	  StaticVariable v2 =new StaticVariable();
	  StaticVariable v3 =new StaticVariable();
      v1.getData();
      v2.getData();
      v3.getData();
      v1.putData();
      v2.putData();
      v3.putData();
}
}
