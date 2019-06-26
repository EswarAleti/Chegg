#include<iostream>
using namespace std;
void doAverage(int x,int y) 
{	
	int sum = x+y;
	// Here i used float variable to represent exact average
	float average = sum/2.0;	
	cout << "Average of " << x << " and " << y << " is " << average << endl;
}
void doLCM(int x,int y) 
{	
	int i;
	//we will proceed to LCM by taking largest value among two values
	if(x>y)
		i=x;
	else
		i=y;
	//We have to iterate until a value i found such that it is divisible by both x and y
	while(true)
	{
		if(i%x==0 && i%y==0)
			break;
		i++;
	}
	cout << "LCM of " << x << " and " << y << " is " << i << endl;
}
void doGCD(int x,int y) 
{	
	int i;
	//we will proceed to GCD by taking smalles value among two values
	if(x<y)
		i=x;
	else
		i=y;
	//We have to iterate until a value i found such that it divides both x and y
	while(true)
	{
		if(x%i==0 && y%i==0)
			break;
		i--;
	}
	cout << "GCD of " << x << " and " << y << " is " << i << endl;
}
