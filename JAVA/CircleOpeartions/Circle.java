//Scanner for taking input from user
import java.util.Scanner;
class Circle
{
	public static void main(String[] args) 
	{
		//creating object to Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the Circle: ");
		//Taking input radius from user as double
		double radius=sc.nextDouble();
		//Function calling and printing the answers
		System.out.println("The Circumference of the circle is: "+CalcCircumference(radius));
		System.out.println("The Area of the circle is: "+CalcArea(radius));
	}
	public static double CalcCircumference(double radius)
	{
		double PI=3.14159;
		//Return the Circumference according to the forumal 2*PI*radius
		return 2*PI*radius;
	}
	public static double CalcArea(double radius)
	{
		double PI=3.14159;
		//Return the Area according to the forumal PI*(radius^2)
		return PI*radius*radius;
	}
}