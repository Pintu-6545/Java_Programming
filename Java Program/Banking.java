package Exception.com;

import java.util.Scanner;

public class Banking {
  public static void main(String[] args) {
	  CheckingAccount c1 =new CheckingAccount(101,"Pintu",2000);
	 Scanner sc = new Scanner(System.in);
	 double amount;
	 while(true)
	 {
		 System.out.println("1. Deposit :");
		 System.out.println("2. Withdraw :");
		 System.out.println("3. Check Balance :");
		 System.out.println("4. Exit :");
		 System.out.println("Enter the Choice:");
		 int choice=sc.nextInt();
		 if(choice==1)
		 {
			 System.out.println("Enter the Amount:");
			 amount=sc.nextDouble();
			 c1.deposit(amount);
		 }
		 else if(choice==2)
		 {
			 System.out.println("Enter the Withdraw Amount:");
			 amount=sc.nextDouble();
			 try
			 {
				 c1.withdrow(amount);
				 
			 }
			 catch(ATMSystemHandling e)
			 {
				 System.out.println("Sorry Need Your Account" + e.getAmount() + "Rs.");
			 }
		 }
		 else if(choice==3)
		 {
			 c1.checkBalace();
		 }
		 else if(choice==4)
		 {
			 System.out.println("Thank You");
			 break;
		 }
		 else
		 {
			 System.out.println("Invalid Choice : Try Again");
		 }
	 }
}
}
