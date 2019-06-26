#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	double x;
	//user input for x
	cout<<"Enter value of x: ";
	cin >> x;
	//checking x
	if(x<=0)
	{
		//2^(-x*3)
		cout<<"Output is: "<<pow(2,(-x*3))<<endl;
	}
	else
	{
		//ln(x) in C++ log(x) in nothing but ln(x)
		cout<<"Output is: "<<log(x)+10<<endl;
	}
	return 0;
}
