class SelectionSort
{
	public static void main(String[] args) 
	{
		int[] arr={5,4,7,3,1};
		System.out.print("\nArray before sorting: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		//Function calling
		selectionSort(arr);
		System.out.print("\nArray after sorting: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void selectionSort(int[] arr)
	{
		int minIndex;
		for(int i=0;i<arr.length-1;i++)
		{
			//minIndex stores the the index of minimum valur from index i+1 to end of array
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				//if value at jth index is smaller than value at minIndex then update minIndex to j
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			//swap arr[i],arr[minIndex]
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
}