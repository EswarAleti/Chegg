import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character array: ");
		String str = sc.nextLine();
		char[] charArray=str.toCharArray();
		reverseArray(charArray,0,(charArray.length)-1);
		System.out.print("Reverse of the string is: ");
		System.out.println(charArray);
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		System.out.print("Enter value of r: ");
		int r = sc.nextInt();
		System.out.println("ncr value is: "+fact(n)/(fact(n-r)*fact(r)));
		System.out.print("Enter value of Decimal number: ");
		int dec = sc.nextInt();
		System.out.print("Binary representation is: ");
		intToBinary(dec);
	}
	public static void reverseArray(char[] arr, int a, int b)
	{
		if(a<b)
		{
			char temp = arr[a];
			arr[a] = arr[b];
			arr[b]=temp;
			reverseArray(arr,a+1,b-1);
		}
	}
	public static int fact(int n)
	{
		if(n==0 || n==1)
			return n;
		return n*fact(n-1);
	}
	public static void intToBinary(int n)
	{
		if(n>0)
		{
			intToBinary(n/2);
			System.out.print(n%2);
		}
	}
}