import java.util.Scanner;
class Hissing
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.contains("ss"))
			System.out.println("hiss");
		else
			System.out.println("no hiss");
	}
}