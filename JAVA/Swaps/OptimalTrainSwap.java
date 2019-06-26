import java.util.Scanner;
class OptimalTrainSwap
{
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			int trainArray[]=new int[50];//Store the carriage sequence
			int testCases=sc.nextInt();//NUmber of test cases
			int outputSwaps[]=new int[testCases];//Storing output values for each sequence
			int n=testCases;
			while(n>0)
			{
				int swap=0;//to find minimum number of swaps
				int carriages=sc.nextInt();//Number of carriages
				for(int i=0;i<carriages;i++)
					trainArray[i]=sc.nextInt();//Enter the sequence
				
				//Bubble sort algorithm
				for(int i=0;i<carriages-1;i++)
				{
					for(int j=i+1;j<carriages;j++)
					{	
						if(trainArray[i]>trainArray[j])//swap required
							swap++;
					}
				}
				outputSwaps[testCases-n]=swap;//storing minimum number of swaps
				n--;
			}
			//Printing the output
			for(int i=0;i<testCases;i++)
				System.out.println("Optimal train swapping takes "+outputSwaps[i]+" swaps.");
	}
}