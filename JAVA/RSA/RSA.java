import java.lang.Math;
import java.util.Scanner;
public class RSA
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int m,e,n;
		System.out.print("Enter message m:");
		m=input.nextInt();
		System.out.print("Enter key(e,n) e followed by n: ");
		e=input.nextInt();
		n=input.nextInt();
		long c=getCipher(m,e,n);
		System.out.println("Cipher text c: "+c);
	}
	public static long getCipher(int m, int e, int n)
	{
		if(m==0)
			return 0;
		if(e==0)
			return 1;
		long c = ((m%n)*getCipher(m,e-1,n))%n;
		return c;
	}
}