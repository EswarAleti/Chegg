class InsertionSortBenchmarker
{
	int[] arr=new int[20];
	InsertionSortBenchmarker(int[] arr)
	{
		this.arr=arr;
	}
	int getNumSwaps()
	{
		int swap=0;
		int size=arr.length;
		for(int i=1;i<size;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
				swap++;
			}
			arr[j+1]=key;
			swap++;
		}
		return swap;
	}
}