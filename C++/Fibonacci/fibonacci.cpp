#include<iostream>
using namespace std;
//function definition
void fibonacci()
{
	//x is first number, y is the last number of the series
	int x=0,y=1;
	//print first number of the series here
	cout << "fibonacci(0) = " << x << endl;
	//iterate for loop for 5 times
	for(int i=1;i<=5;i++)
	{
		cout << "fibonacci(" << i <<") = "<< y << endl;
		//store y into a temporary variable temp
		int temp=y;
		//sum previous x and y and assign it to y
		y=x+y;
		//assign temp to x
		x=temp;
	}
}
int main()
{
	//function calling
	fibonacci();
	return 0;
}
