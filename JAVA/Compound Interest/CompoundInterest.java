import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.*;
class CompoundInterest
{
	public static void main(String[] args) 
	{
		//Scanner class for user input
		Scanner sc=new Scanner(System.in);
		double amount,interestRate;
		int years;
		//User inputs
		System.out.print("Enter the amount of your deposit: ");
		amount=sc.nextDouble();
		System.out.print("Enter interest rate per year: ");
		interestRate=sc.nextDouble();
		System.out.print("Enter number of years: ");
		years=sc.nextInt();

		System.out.println("\n--------------------------------------\n");
		
		double balance1=recursive(amount,interestRate,years);
		double balance2=nonRecursive(amount,interestRate,years);
		//Following four line are nothing but rounding the interest to two decimal places
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		balance1=Double.parseDouble(df.format(balance1));
		balance2=Double.parseDouble(df.format(balance2));
		//Output printing
		System.out.println("Your initial deposit: $"+amount);
		System.out.println("Interest rate per year: "+interestRate+"%");
		System.out.println("After "+years+" years, you will get the total of $"+balance1+" in your savings account");
		//If results are same in both recursive and non recursive methods prints it as corrrect result
		if(balance1==balance2)
			System.out.println("My program verifies that $"+balance1+" is the correct amount");

	}
	public static double recursive(double amount,double interestRate,int year)
	{
		//If years are end return interest Amount
		if(year==0)
			return amount;
		//Calculate interest and add to amount
		amount = amount + (amount*interestRate);
		//Call rersive() by decreasing year by 1
		return recursive(amount,interestRate,year-1);
	}
	public static double nonRecursive(double amount,double interestRate,int year)
	{
		//calculate using formula P(1+i)^n
		return amount*Math.pow(1+interestRate,year);
	}
}