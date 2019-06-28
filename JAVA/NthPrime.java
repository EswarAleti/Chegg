import java.lang.Math;
public class NthPrime
{
	public static boolean isPrime(int n)
	{
		if(n==2)
			return true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int nthPrime(int n)
	{
		int count=0,var=2;
		while(true)
		{
			if(isPrime(var))
			{
				count++;
			}
			if(count==n)
				return var;
			var++;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(nthPrime(25));
	}	
}