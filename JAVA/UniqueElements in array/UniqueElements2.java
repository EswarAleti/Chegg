import java.util.Scanner;
public class UniqueElements2 
{
	public static void main(String args[]) 
	{
		int arr[]= new int [10];
		Scanner input = new Scanner (System.in);
		int i,j;
		System.out.print("Enter 10 integers : ");
		for (i=0;i<10;i++)
		{
			arr[i] = input.nextInt();
		}
		int hash[]= new int [100];
		hash[0]=-1;
		System.out.print("Unique Elements: ");
		for(i=0;i<10;i++)
		{
			int rem = arr[i]%100;
			if(arr[i]!=hash[rem])
			{
				System.out.print(arr[i]+" ");
				hash[rem]=arr[i];
			}
		}
	}
}