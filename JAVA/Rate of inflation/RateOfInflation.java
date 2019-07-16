import java.util.Scanner;
public class RateOfInflation
{
	public static void main(String[] args) 
	{
		//Scanner class is used to get input from user
		//Creating object for Scanner class
		Scanner scanner=new Scanner(System.in);

		//User inputs
		System.out.print("Enter the name of person: ");
		String name=scanner.nextLine();
		System.out.print("Enter last year cost of item: ");
		double lastYearCost=scanner.nextDouble();
		System.out.print("Enter current cost of item: ");
		double currentCost=scanner.nextDouble();
		
		//Finding rate of inflation using below formula
		double rate=(currentCost-lastYearCost)/lastYearCost;
		
		//output the rate of inflation
		System.out.println("Rate of Inflation is: "+rate);

		//Output the estimated cost of item in next two years
		//Cost of the item in next year depends on current year cost i.e. currentCost
		System.out.println("Expected cost of item in next year: "+currentCost*(1+rate));
		//Cost of the item in 2nd year depends on  previous year cost i.e. currentCost(1+rate)
		System.out.println("Expected cost of item in 2nd year: "+currentCost*(1+rate)*(1+rate));		
	}	
}