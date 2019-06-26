#include<stdio.h>
int main()
{
	int year;
	printf("Enter a 4 digit number: ");
	scanf("%d",&year);
	// If year divisible by 4 check whether it is divisible by 100 or not
	if(year%4 == 0)
	{
		// If year divisible by 100 check whether it is divisible by 400 or not
		if(year%100 == 0)
		{
			// // If year divisible by 4,100 and AND divisible by 400 then it is a leap year
			if(year%400 == 0)
			{
				printf("%d is a leap year",year);
			}
			// If year divisible by 4,100 and AND NOT divisible by 400 then it is NOT a leap year
			else
			{
				printf("%d is NOT a leap year",year);
			}
		}
		// If year divisible by 4 and NOT divisible by 100 then it is a leap year
		else
		{
			printf("%d is a leap year",year);
		}
	}
	// If year NOT divisible by 4 then it is NOT a leap year
	else
	{
		printf("%d is NOT a leap year",year);
	}
	return 0;
}
