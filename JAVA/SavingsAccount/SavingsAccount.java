public class SavingsAccount
{
	private double balance;
	private double interestRate;
	private double lastInterest;
	//constructor
	SavingsAccount(double bal, double intRate)
	{
		this.balance=bal;
		this.interestRate=intRate;
	}
	//withdraw method
	public void withdraw(double amount)
	{
		//deduct withdrawl amount from balance
		balance=balance-amount;
	}
	//deposit method
	public void deposit(double amount)
	{
		//add deposited amount to balance
		balance=balance+amount;
	}
	//addInterest method
	public void addInterest()
	{
		//Finding interest per month that is why i used 12 (a year has 12 months)
		double interest=balance*(interestRate/12);
		//add calculated interest to balance
		balance=balance+interest;
		//add calculated interest to lastInterest 
		lastInterest=lastInterest+interest;
	}
	//getBalance method
	public double getBalance()
	{
		//Math.round(balance*100.0)/100.0 because rounding balance to 2 decimal places
		return Math.round(balance*100.0)/100.0;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public double getLastInterest()
	{
		//Math.round(lastInterest*100.0)/100.0 because rounding lastInterest to 2 decimal places
		return Math.round(lastInterest*100.0)/100.0;
	}
}