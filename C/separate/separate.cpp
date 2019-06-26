#include<stdio.h>
//separate function definition
void separate(int *a,int n, int value, int *larger, int *size, int *smaller)
{
	int *p,i=0;
	p=a;
	//check every element in the array
	for(;p<(a+n);p++)
	{
		//If array element in greater that value then store it into larger array
		if(*(p)>value)
		{
			//store into larger array at index size
			*(larger+*size)=*(p);
			//increment the index
			(*size)++;
		}
		else
		{
			//samller array index is (i-*size)
			*(smaller+i)=*(p);
			i++;
		}
	}
}
int main()
{
	int n,size=0,i,value;
	//user input
	printf("Enter the leght of the array: ");
	scanf("%d",&n);
	int a[n],larger[n],smaller[n];
	//user input for array
	printf("Enter the elements of the array: ");
	for(i=0;i<n;i++)
	{
		scanf("%d",(a+i));
	}
	printf("Enter the value for separating the array: ");
	scanf("%d",&value);
	//function calling
	separate(a,n,value,larger,&size,smaller);
	printf("\nArray with elements larger than %d: ",value);
	//printing the output
	for(i=0;i<size;i++)
	{
		printf("%d ",*(larger+i));
	}
	printf("\nArray with elements smaller than %d: ",value);
	for(i=0;i<(n-size);i++)
	{
		printf("%d ",*(smaller+i));
	}
	return 0;
}
