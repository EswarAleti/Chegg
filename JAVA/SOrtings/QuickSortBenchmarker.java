class QuickSortBenchmarker
{
	int[] arr=new int[20];
	int swap;
	QuickSortBenchmarker(int[] arr)
	{
		this.arr=arr;
		this.swap=0;
	}
	int getNumSwaps()
	{
		int size=arr.length;
		sort(arr,0,size-1);
		return swap;
	}
	int partition(int arr[], int lowIndex, int highIndex) 
	{ 
		int pivot = arr[highIndex];  
		int i = (lowIndex-1); // index of smaller element 
		for (int j=lowIndex; j<highIndex; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
				swap++;
			} 
		}
		int temp = arr[i+1]; 
		arr[i+1] = arr[highIndex]; 
		arr[highIndex] = temp; 
		swap++;
		return i+1; 
	} 
	void sort(int[] arr, int lowIndex, int highIndex) 
	{ 
		if (lowIndex < highIndex) 
		{ 
		int pivotIndex = partition(arr, lowIndex, highIndex); 
		sort(arr, lowIndex, pivotIndex-1); 
		sort(arr, pivotIndex+1, highIndex); 
		} 
	} 
}