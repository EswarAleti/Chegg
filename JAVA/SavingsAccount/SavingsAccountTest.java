//import Scanner class to take input from user
import java.util.Scanner;
public class SavingsAccountTest
{
	public static void main(String[] args) 
	{
		//creating object to Scanner class
		Scanner sc=new Scanner(System.in);
		double bal,intRate;
		int months;
		//Taking inputs from user
		System.out.print("Enter the savings's account starting balance: ");
		bal=sc.nextDouble();
		System.out.print("Enter the saving's account annual interest: ");
		intRate=sc.nextDouble();
		System.out.print("How many months passed since the account was opened?: ");
		months=sc.nextInt();

		//creating object to SavingsAccount class
		SavingsAccount obj=new SavingsAccount(bal,intRate);
		//totalDeposit variable stores the total amount deposited
		//totalWithdraw variable stores the total amount withdrawn
		double totalDeposit=0,totalWithdraw=0;
		//iterate for loop for desired number of months
		for(int i=1;i<=months;i++)
		{
			//user inputs deposit,withdrawl amount for every month
			double depositAmount,withdrawlAmount;
			System.out.print("Enter the amount deposited during month"+i+": ");
			depositAmount=sc.nextDouble();
			//add depositAmount to totalDeposit
			totalDeposit=totalDeposit+depositAmount;
			//call deposit method to add depositAmount to balance
			obj.deposit(depositAmount);
			System.out.print("Enter the amount withdrawn during month"+i+": ");
			withdrawlAmount=sc.nextDouble();
			//add withdrawlAmount to totalWithdraw
			totalWithdraw=totalWithdraw+withdrawlAmount;
			//call withdraw method to deduct withdrawlAmount from balance
			obj.withdraw(withdrawlAmount);
			//call addInterest menthod for every month to add interest to balance
			obj.addInterest();
		}
		//printing outputs
		System.out.println("Total deposited: $"+totalDeposit);
		System.out.println("Total withdrawn: $"+totalWithdraw);
		System.out.println("Interest earned: $"+obj.getLastInterest());
		System.out.println("Ending balance: $"+obj.getBalance());
	}
}