import java.util.Scanner;
class FractionArith
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1,d1,n2,d2;
		//User Inputs
		System.out.print("Enter numerator: ");
		n1 = sc.nextInt();
		System.out.print("Enter denominator: ");
		d1 = sc.nextInt();
		System.out.print("Enter numerator: ");
		n2 = sc.nextInt();
		System.out.print("Enter denominator: ");
		d2 = sc.nextInt();
		//division with 0 is invalid
		if(d1==0 || d2==0)
			System.out.println("Invalid fractions");
		else
		{
			//function calling and output prinitng
			System.out.println("Result as fraction and mixed number: ");
			add(n1,d1,n2,d2);
			sub(n1,d1,n2,d2);
			mul(n1,d1,n2,d2);
			div(n1,d1,n2,d2);
			//floating point result
			float num1 = (float)n1/d1;
			float num2 = (float)n2/d2;
			System.out.println("Result as floating point number: ");
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
			System.out.println(num1+" % "+num2+" = "+(num1/num2));	
		}
	}
	public static void add(int n1,int d1,int n2,int d2)
	{
		//newDenominator is product of d1,d2
		int newD = d1*d2;
		//Formula for finding new neumerator
		int newN = (newD/d1)*n1 + (newD/d2)*n2;
		//quotiend of new fraction
		int q = newN/newD;
		//reminder of new fraction 
		int r = newN%newD;
		//output printing
		System.out.println(n1+"/"+d1+" + "+n2+"/"+d2+" = "+newN+"/"+newD+" = "+q+" "+r+"/"+newD);
	}
	public static void sub(int n1,int d1,int n2,int d2)
	{
		int newD = d1*d2;
		int newN = (newD/d1)*n1 - (newD/d2)*n2;
		int q = newN/newD;
		int r = newN%newD;
		System.out.println(n1+"/"+d1+" - "+n2+"/"+d2+" = "+newN+"/"+newD+" = "+q+" "+r+"/"+newD);
	}
	public static void mul(int n1,int d1,int n2,int d2)
	{
		int newD = d1*d2;
		int newN = n1*n2;
		int q = newN/newD;
		int r = newN%newD;
		System.out.println(n1+"/"+d1+" * "+n2+"/"+d2+" = "+newN+"/"+newD+" = "+q+" "+r+"/"+newD);
	}
	public static void div(int n1,int d1,int n2,int d2)
	{
		int newD = n2*d1;
		int newN = n1*d2;
		int q = newN/newD;
		int r = newN%newD;
		System.out.println(n1+"/"+d1+" % "+n2+"/"+d2+" = "+newN+"/"+newD+" = "+q+" "+r+"/"+newD);
	}
}