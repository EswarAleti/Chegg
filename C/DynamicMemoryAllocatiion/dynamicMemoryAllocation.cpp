#include<stdio.h>
#include<stdlib.h>
int* allocate(int n)
{
	int *ptr;
	ptr = (int *)malloc(n*sizeof(int));
	return ptr;
}
void set(int *b, int index, int number)
{
	*(b+index) = number;
}
int get(int *b, int index)
{
	return *(b+index);
}
int main()
{
	int *ptr,i;
	ptr = allocate(10);
	set(ptr,4,123);
	set(ptr,2,34);
	set(ptr,1,53);
	set(ptr,3,6);
	set(ptr,0,19);
	//print the values of indices 0,1,2,3,4 respectivly
	for(i=0;i<5;i++)
		printf("Value at index %d is %d\n",i,get(ptr,i));
}
