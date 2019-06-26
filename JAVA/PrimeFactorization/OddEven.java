public class OddEven
{
	public static void main(String[] args) 
	{
		//fucntion calling and printing the solution
		System.out.println(oddEvenRep(50));
		System.out.println(oddEvenRep(13));
		System.out.println(oddEvenRep(32));
	}
	public static String oddEvenRep(int num)
	{
		//counts the power of 2
		int countPower=0;
		// iterate until num becomes odd
		while(num%2==0)
		{
			//increment countPower by 1
			countPower++;
			//Reduce num by dividing with 2
			num=num/2;
		}
		//return the string
		return "2^"+countPower+" times "+num;
	}
}