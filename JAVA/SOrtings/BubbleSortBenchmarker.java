class BubbleSortBenchmarker
{
	int[] arr=new int[20];
	BubbleSortBenchmarker(int[] arr)
	{
		this.arr=arr;
	}
	int getNumSwaps()
	{
		int swap=0;
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
			}
		}
		return swap;
	}
}