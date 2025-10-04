import java.lang.*;
import java.util.Scanner;
public class Second {
	public static void main(String[] args) {
		
		int no1,no2;
		Scanner sci=new Scanner(System.in);
		System.out.println("Enter the Number1");
		no1=sci.nextInt();
		System.out.println("Enter the Number2");
		no2=sci.nextInt();
		int sum=no1+no2;
		System.out.println("Addition:"+sum);
		int sub=no1-no2;
		System.out.println("Subtraction:"+sub);
		int multi=no1*no2;
		System.out.println("Multiplication:" + multi);
		int div=no1/no2;
		System.out.println("Division:" +div);
	}
}
