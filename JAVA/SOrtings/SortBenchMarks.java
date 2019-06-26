public class SortBenchMarks
{
	public static void main(String [] args)
	{
		// Arrays of numbers to search.
		int numbers1[] = { 536, 289, 296, 429, 319, 142, 394, 101, 388, 147, 417, 199, 207, 222, 189, 310, 447, 521, 234, 600};
		int numbers2[] = { 536, 289, 296, 429, 319, 142, 394, 101, 388, 147, 417, 199, 207, 222, 189, 310, 447, 521, 234, 600};
		int numbers3[] = { 536, 289, 296, 429, 319, 142, 394, 101, 388, 147, 417, 199, 207, 222, 189, 310, 447, 521, 234, 600};
		int numbers4[] = { 536, 289, 296, 429, 319, 142, 394, 101, 388, 147, 417, 199, 207, 222, 189, 310, 447, 521, 234, 600};
		// Create our benchmark objects.
		BubbleSortBenchmarker bsort = new BubbleSortBenchmarker(numbers1);
		SelectionSortBenchmarker ssort = new SelectionSortBenchmarker(numbers2);
		InsertionSortBenchmarker isort = new InsertionSortBenchmarker(numbers3);
		QuickSortBenchmarker qsort = new QuickSortBenchmarker(numbers4);
		// Display the numbers of swaps made.
		System.out.println("Number of swaps made with bubble sort: " + bsort.getNumSwaps());
		System.out.println("Number of swaps made with selection sort: " + ssort.getNumSwaps());
		System.out.println("Number of swaps made with insertion sort: " + isort.getNumSwaps());
		System.out.println("Number of swaps made with Quicksort: " + qsort.getNumSwaps());
	}
}