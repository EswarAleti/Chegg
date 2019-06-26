import java.util.Scanner;
public class Nprint
{
	public static void main(String[] args) 
	{
		int dec;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number:");
		dec = sc.nextInt();
		if(dec==0)
			System.out.println("Binary number:"+0);
		if(dec>0)
			System.out.println("Binary number:"+binary(dec));
	}
	public static String binary(int dec)
	{
		if(dec > 0)
			return (binary(dec / 2) + "" + dec%2);
		return "";
	}
}