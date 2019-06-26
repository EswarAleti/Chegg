#include<iostream>
using namespace std;
//Function definition it returns the total number of ways to climb n stairs
int Fib(int n)
{
	//Base condition
	if(n==0 || n==1)
		return 1;
	//Recurracne relation
	return Fib(n-1)+Fib(n-2);
}
int main()
{
	int steps;
	//User input
	cout <<"Enter number of steps: ";
	cin >> steps;
	//Function calling and printing the solution
	cout <<"Number of ways are: "<<Fib(steps)<<endl;
	return 0;
}
