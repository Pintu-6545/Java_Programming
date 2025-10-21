package Interface.com;

import java.util.Scanner;

interface Wel
{
	abstract void Data(int no);
  public static void show()
  {
	  System.out.println("Show Method is Interface 1:");
  }
}
interface Wel1 extends Wel
{
	abstract void Data1(int no);
	public static void Show1()
	{
		System.out.println("Show1 Method is Interface 2");
	}
}
class Den1 implements Wel1
{

	public void Data(int no) {
	   
		if(no%2==0)
		{
			System.out.println("Even Number:" +no);
		}
		else
		{
			System.out.println("Odd Number:" + no);
		}
		
	}

	public void Data1(int no) {
	
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
public class InterfaceDemo {
   
	public static void main(String [] args)
	{
		 Scanner sc = new Scanner(System.in);
		 Wel.show();
		 Wel1.Show1();
		 Den1 d1 =new Den1();
		 System.out.println("Enter the Number:");
		 int no=sc.nextInt();
		 d1.Data(no);
		 d1.Data1(no);
		 }
}
