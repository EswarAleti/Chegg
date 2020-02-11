import java.util.Scanner;
class Theater
{
	public static void main(String[] args) 
	{
		//Object creation for scanner class
		Scanner input=new Scanner(System.in);
		
		//User input and appropriate promptings
		System.out.print("No. of Balcony tickets: ");
		int balcony = input.nextInt();
		System.out.print("No. of VIP tickets: ");
		int vip = input.nextInt();
		System.out.print("No. of Basic tickets: ");
		int basic = input.nextInt();

		//Finding total income of theater
		int totalIncome = balcony*100 + vip*50 + basic*30;

		//User input and appropriate promptings
		System.out.println("************************************");
		System.out.print("Bills: ");
		int bill = input.nextInt();
		System.out.print("salaries: ");
		int salries = input.nextInt();
		System.out.println("************************************");

		//Finding total investment and profit
		int totalInvestment = bill + salries;
		int profit = totalIncome - totalInvestment;

		//Printing the final output
		System.out.println("Profit = "+totalIncome+" - "+totalInvestment+" = "+profit+" AED");
	}	
}