import java.util.Scanner;
public class Main
{
	//This method returns true if n is prime, fasle otherwise
	public static boolean isPrime(int n)
	{
		//Base condition
		if(n==2)
			return true;
		//Prime number(Except 2) should not have any factor between (2,n-1)
		for(int i=2;i<n;i++)
		{
			//If n has a factor then return fasle
			if (n%i==0) 
			{
				return false;	
			}
		}
		//We get here if n is prime so return true
		return true;
	}
	public static void printPrime(int a,int b)
	{
		int limit=0;
		//Iterate between a,b (Exclusive)
		for(int i=a+1;i<b;i++)
		{
			//If j is prime incement limit and print j value
			if(isPrime(i))
			{
				System.out.print(i+" ");
				limit++;
			}
			//If limit reaches 5 then print a new line and reset limit to 0
			if(limit==5)
			{
				System.out.println();
				limit=0;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		//User input
		System.out.print("Enter value of A: ");
		a=sc.nextInt();
		System.out.print("Enter value of B: ");
		b=sc.nextInt();
		printPrime(a,b);
	}
}