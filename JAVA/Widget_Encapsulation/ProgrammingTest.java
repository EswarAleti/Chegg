import java.util.*;
public class ProgrammingTest
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		ArrayList<Widget> list=addWidgets(scanner);
		System.out.println("String is: "+makeString("Hi","You"));
		System.out.println("String is: "+makeString("OH","YEAH"));
		int[] arr=makeArray(1,3,5);
		System.out.println("Array is: {"+arr[0]+","+arr[1]+","+arr[2]+"}");
		arr=makeArray(3,0,0);
		System.out.println("Array is: {"+arr[0]+","+arr[1]+","+arr[2]+"}");
	}
	public static ArrayList<Widget> addWidgets(Scanner scanner)
	{
		ArrayList<Widget> list = new ArrayList<Widget>();
		String s;
		int i;
		double d;
		while(true)
		{
			System.out.print("Enter s: ");
			s=scanner.next();
			System.out.print("Enter i: ");
			i=scanner.nextInt();
			System.out.print("Enter d: ");
			d=scanner.nextDouble();	
			Widget widget=new Widget(s,i,d);
			list.add(widget);
			char choice;
			System.out.print("Enter y to quit: ");
			choice=scanner.next().charAt(0);
			if(choice=='y')
				break;
		}
		return list;	
	}
	public static String makeString(String a, String b)
	{
		return b+b+a;
	}
	public static int[] makeArray(int a,int b, int c)
	{
		int[] arr=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		return arr;
	}
}