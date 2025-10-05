package core.java;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3;
		int z;
	    int total;
	     System.out.println("Enter the Subject1:");
	     s1=sc.nextInt();
	     System.out.println("Enter the Subject2:");
	     s2=sc.nextInt();
	     System.out.println("Enter the Subject3:");
	     s3=sc.nextInt();
	     if(s1==s2 || s1==s3 || s2==s3)
	     {
	    	 total=s1+s2+s3;
	    	 z=total=0;
	    	 System.out.println("Total of Number Two:" +z );
	     }
	     else
	     {
	    	 total=s1+s2+s3;
	    	 System.out.println("Total Number of Three:" +total);
	     }
		
	}

}
