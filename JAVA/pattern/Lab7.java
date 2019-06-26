import java.util.Scanner;
public class Lab7
{
	public static void main(String[] args) 
	{
		//creating object fro Scanner class
		Scanner sc=new Scanner(System.in);
		//User inputs
		System.out.print("Name of the builder :");
		String name=sc.next();
		//Creating object for Builder class by passing name as argument
		Builder obj = new Builder(name);
		System.out.println("The name of builder is :"+obj.getName());
		System.out.print("Enter a positive integer :");
		int n=sc.nextInt();
		System.out.println();
		//Callink makeRow() for first pattern
		System.out.print(obj.makeRow(n,"="));
		System.out.print(obj.makeRow(n,"*"));
		System.out.println(obj.makeRow(n,"="));
		System.out.println();
		System.out.print("Enter a positive odd integer :");
		int num = sc.nextInt();
		//Calling printPyramid()
		obj.printPyramid(num,"*");
	}	
}