import java.util.Scanner;
public class UniqueElements 
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
		System.out.print("Unique Elements: ");
		for(i=0;i<10;i++)
		{
			//found is used to know whether value is found or not
			int found=0;
			//Check left part of the array from i-1 to 0
			for(j=i-1;j>=0;j--)
			{
				//If value found then make found as 1
				if(arr[i]==arr[j])
					found=1;
			}
			//If it is not found yet the print
			if(found==0)
				System.out.print(arr[i]+" ");		
		}
	}
}