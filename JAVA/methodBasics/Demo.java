//import Scanner class which is used to take input from user
import java.util.Scanner;
public class Demo
{
	//gloabl variable
	static int val = 5;
	public static void main(String[] args) 
	{
		//method calling
		voidMethod();
		
		//method calling and store the return value of method in a variable square
		int square=returnMethod();
		//output printing
		System.out.println("value returned by the returnMehhod() is: "+square);
		
		//Creating object for scanner class
		Scanner input=new Scanner(System.in);
		//prompt user for input
		System.out.print("Enter a number: ");
		//taking user input
		int n=input.nextInt();
		//function calling by passing a value
		acceptMethod(n);		
	}
	public static void voidMethod()
	{
		System.out.println("This is a void method, it returns nothing");
	}
	public static int returnMethod()
	{
		//find square
		int square = val*val;
		System.out.println("This is a return method which returns sqaure of the val");	
		//return square value
		return square;
	}
	public static void acceptMethod(int n)
	{
		//this method finds sum of integers from 1 to n
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("This is a mothod that accepts a value");
		System.out.println("sum is: "+sum);
	}
}