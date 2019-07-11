public class Banish
{
	public static void main(String[] args) 
	{
		int[] a1={42,3,9,42,42,0,42,9,42,42,17,8,2222,4,9,0,1};
		int[] a2={42,2222,9};
		//functionc calling
		banish(a1,a2);
		//printing of resulted array a1
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+", ");
		}
	}
	public static void banish(int[] a1, int[] a2)
	{
		int i,j,k;
		//Iterate over each element of a2 and remove it from a1
		for(i=0;i<a2.length;i++)
		{
			//iterate over a1 and remove a2[i] from a1
			for (j=0; j<a1.length; j++) 
			{
				//If it present then shift it
				if(a2[i]==a1[j])
				{
					//shifting
					for(k=j;k<a1.length-1;k++)
					{
						a1[k]=a1[k+1];
					}
					//insert 0 at last
					a1[k]=0;
					//again start from the previous index
					j--;
				}
			}
		}
	}
}