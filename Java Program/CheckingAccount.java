package Exception.com;

public class CheckingAccount {

	int acno;
	String name;
	double balance;
	public CheckingAccount(int acno,String name,double balance)
	{
		this.acno=acno;
		this.name=name;
		this.balance=balance;
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	public void withdrow(double amount) throws ATMSystemHandling
	{
		if(amount<=this.balance)
		{
			this.balance=this.balance-amount;
		}
		else
		{
			throw new ATMSystemHandling(amount-this.balance);
		}
	}
	public void checkBalace()
	{
		System.out.println("Current Balance" + this.balance);
	}
}
