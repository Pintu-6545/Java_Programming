import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1:");
		int no1=sc.nextInt();
		System.out.println("Enter the Number2:");
		int no2=sc.nextInt();
		System.out.println("Before Swaping:");
		System.out.println("Number1:" +no1);
		System.out.println("Number2:" +no2);
		System.out.println("After Swaping");
		int temp;
		temp=no1;
		no1=no2;
		no2=temp;
		System.out.println("Number1:"+no1);
		System.out.println("Number2:"+no2);
	}
}
