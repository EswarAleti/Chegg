#include<stdio.h>
//functions initializations
double f_to_c(double);
void convert_and_print(double);
int main()
{
	//convert_and_print function calling
	convert_and_print(32);
	convert_and_print(0);
	convert_and_print(100);
	convert_and_print(132);
	convert_and_print(240);
	return 0;
}
//f_to_c() function definition it returns the equvivalant celsius value
double f_to_c(double f)
{
	//calculating celsius using below formula
	double c = (5/9.0)*(f-32);
	return c;
}
//convert_and_print() function definition
void convert_and_print(double f)
{
	double c = f_to_c(f);
	printf("%.2lf degrees Fahrenheit is %.2lf degrees Celsius\n",f,c);
}
