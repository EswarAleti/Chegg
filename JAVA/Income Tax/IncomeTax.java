import java.util.Scanner;
public class IncomeTax
{
	public static void main(String[] args)
	{
		final int MAX_ELEMENTS = 10;
		Scanner scnr=new Scanner(System.in);
		int annualSalary;
		double taxRate;
		int taxToPay;
		int numSalaries;
		boolean keepLooking;
		int i;
		double[][] taxInfo = {{20000,0.1},{50000,0.2},{100000,0.3},{999999999,0.4}};
		numSalaries=0;
		System.out.print("Enter annual salary(0 to exit): ");
		annualSalary=scnr.nextInt();
		while(annualSalary>0)
		{
			i=0;
			taxRate=0;
			keepLooking=true;
			while((i<taxInfo.length) && keepLooking)
			{
				if(annualSalary <= taxInfo[i][0])
				{
					taxRate=taxInfo[i][1];
					keepLooking=false;
				}
				else
				{
					i++;
				}
			}
			taxToPay=(int)(annualSalary*taxRate);
			System.out.println("Annual salary: "+annualSalary+"\tTax rate: "+taxRate+"\tTax to pay: "+taxToPay);
			System.out.print("Enter annual salary(0 to exit): ");
			annualSalary=scnr.nextInt();
		}
	}
}