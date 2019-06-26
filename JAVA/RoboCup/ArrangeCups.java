import java.util.Scanner;
class ArrangeCups
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		//Creating a 2-Dimensional array for user input
		String[][] inputOrder=new String[N][2];
		for(int i=0;i<N;i++)
		{
			inputOrder[i][0]=sc.next();
			inputOrder[i][1]=sc.next();
		}
		//Creating a 2-D array to arrange the user in a specific order
		//First index stores the color
		//second index stores the radius
		String[][] outputOrder=new String[N][2];
		for(int i=0;i<N;i++)
		{
			char ch=inputOrder[i][0].charAt(0);
			//If first one is number then convert it to integer
			if(ch>='0' && ch<='9')
			{
				int diameter=Integer.parseInt(inputOrder[i][0]);
				//radius=diameter/2
				//insert radius to 2nd index of outputOrder
				outputOrder[i][1]=""+(diameter/2);
				//insert color to 2nd index of outputOrder
				outputOrder[i][0]=inputOrder[i][1];
			}
			//First index is color the store in same order
			else
			{
				outputOrder[i][0]=inputOrder[i][0];
				outputOrder[i][1]=inputOrder[i][1];
			}
		}
		String temp;
		/*Sorting with respect to radius*/
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				int r1=Integer.parseInt(outputOrder[i][1]);
				int r2=Integer.parseInt(outputOrder[j][1]);
				if(r2<r1)
				{
					temp=outputOrder[j][0];
					outputOrder[j][0]=outputOrder[i][0];
					outputOrder[i][0]=temp;
					temp=outputOrder[j][1];
					outputOrder[j][1]=outputOrder[i][1];
					outputOrder[i][1]=temp;
				}
			}
		}
		//Now array is in increasing order of colors
		for(int i=0;i<N;i++)
			System.out.println(outputOrder[i][0]);
	}
}