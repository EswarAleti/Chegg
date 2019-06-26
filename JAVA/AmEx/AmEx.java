import java.util.Random;
import java.util.Scanner;
class AmEx
{
	public static void main(String[] args) 
	{
		//Creating object for Random() class
		Random rand = new Random();
		//Creating object for Scanner() class
		Scanner sc = new Scanner(System.in);
		//User input
		System.out.println("How many AmEx number would you like to generate?");
		int num=sc.nextInt();
		//Array initialization
		int[] arr=new int[15];
		System.out.println("Here you go, have fun:");
		//Iterate for num times
		for (int count=0;count<num;count++) 
		{
			//index is the index of the array
			int index=0;
			//0th index shoudl be 3
			arr[index++]=3;
			while(true)
			{
				int n = rand.nextInt(10);
				//index 1 should contains either 4 or 7
				if(n==7 || n==4)
				{
					arr[index++]=n;
					break;
				}
			}
			//generate remaining 12 digits
			for(int i=0;i<12;i++)
				arr[index++]=rand.nextInt(10);
			int sum=0;
			//find sum according to formula
			for(int i=0;i<14;i++)
			{
				if(i%2!=0)
				{	
					if(2*arr[i]>9)
						sum=sum+ (2*arr[i]-9);
					else
						sum=sum+(2*arr[i]);
				}
				else
					sum=sum+arr[i];
			}
			//find x between 0 to 9 satisify our condition
			for(int x=0;x<10;x++)
			{
				if((sum+x)%10==0)
				{
					arr[index++]=x;
					break;
				}
			}
			//printing the array
			for(int i=0;i<15;i++)
				System.out.print(arr[i]);
			//for new line	
			System.out.println();		
		}
	}
}