package Exception.com;

public class ATMSystemHandling extends Exception {
      double amount;
	public ATMSystemHandling(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return this.amount;
	}
}
