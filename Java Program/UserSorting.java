package core.java;

import java.util.Scanner;

public class UserSorting {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,temp;
		System.out.println("Enter the Size of Array of Values:");
		no=sc.nextInt();
		int [] ar= new int[no];
		for(int i=0;i<no;i++)
		{
			 System.err.println("Enter the Array of Data:");
			 ar[i]=sc.nextInt();
		}
		System.out.println("Assending Order OF Array:");
		for(int i=0;i<no;i++)
		{
			   for(int j=i+1;j<no;j++)
			   {
				   if(ar[i]>ar[j])
				   {
					   temp=ar[i];
					   ar[i]=ar[j];
					   ar[j]=temp;
				   }
			   }
			   System.out.println("Array Data:" +ar[i]);
		}
		System.out.println("Decending Order of Array Data:");
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println("Array Data:" + ar[i]);
		}
		}
}
