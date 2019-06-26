#include<stdio.h>
int main()
{
	//initializing array with 10 elements
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	//sum variable is used to find the sum of elements in array 
	//Initially sum should be 0
	int i,sum=0;
	//iterate array from index 0 to 9
	for(i=0;i<=9;i++)
	{
		//add each element of array to sum variable
		sum=sum+arr[i];
	}
	//Print the sum of elements in array
	printf("Sum of the elements in array is : %d",sum);
	return 0;
}
