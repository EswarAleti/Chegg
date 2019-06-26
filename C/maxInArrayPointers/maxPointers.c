#include <stdio.h>
#define MAX 20
int largest(int * x);
void display(int *arr);
int main()
{
	int array[MAX], count;
	int i;
	//take MAX number of inputs from user
	for(i=0;i<MAX;i++)
	{
		scanf("%d",(array+i));
	}
	//display() function calling 
	printf("Elements in the array are: ");
	display(array);
	//display largest() function calling and print the value
	printf("\nLargest value: %d\n", largest(array));
	return 0;
}
void display(int *arr)
{
	int i;
	//*(arr+i) gives the value of arr at ith index
	for(i=0;i<MAX;i++)
		printf("%d ",*(arr+i));
}
int largest(int *arr)
{
	int max_value=*arr,i;
	for(i=1;i<MAX;i++)
	{
		if(*(arr+i)>max_value)
			max_value=*(arr+i);
	}
	return max_value;
}
