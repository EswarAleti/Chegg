class SelectionSortBenchmarker
{
	int[] arr=new int[20];
	SelectionSortBenchmarker(int[] arr)
	{
		this.arr=arr;
	}
	int getNumSwaps()
	{
		int swap=0;
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<size;j++)
			{
				if (arr[j] < arr[minIndex])
                	minIndex=j;
			}
			int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            swap++;
		}
		return swap;
	}
}