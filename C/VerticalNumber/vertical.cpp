#include<stdio.h>
int vertical(int);
int main(void)
{
	int num;
	printf("Enter a number: ");
	scanf("%d",&num);
	vertical(num);
	return 0;
}
int vertical(int n)
{
	if(n==0)
		return 0;
	//It stores the last digit of number
	int temp=n%10;
	//We have to print remainders from last to first
	//eg. 1234 we get remainders like 4 3 2 1 
	//To get correct vertical order we need to print it from last to first
	// Like 1 2 3 4 that is why we have used recursion first and then printing
	vertical(n/10);
	printf("%d\n",temp);
}
