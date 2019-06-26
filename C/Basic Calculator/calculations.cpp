#include<stdio.h>
int main()
{
	char op;
	float a,b;
	//User input for operator
	printf("Please enter the operator (+,-,*, or /) :");
	scanf("%c",&op);
	//user input for two operands
	printf("Now, enter the two operands separated by a space: ");
	scanf("%f%f",&a,&b);
	//If operator is + the print the sum of operands
	if(op=='+')
	{
		printf("The result is: %f",a+b);
	}
	//If operator is - the print the subtraction of operands
	else if(op=='-')
	{
		printf("The result is: %f",a-b);
	}
	//If operator is * the print the multiplication of operands
	else if(op=='*')
	{
		printf("The result is: %f",a*b);
	}
	//If operator is / the print the division of operands
	else if(op=='/')
	{
		printf("The result is: %f",a/b);
	}
	return 0;
}
