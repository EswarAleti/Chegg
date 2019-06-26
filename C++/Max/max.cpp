#include <iostream>
using namespace std;
void max(int,int);//max function declaration calcuate maximum among two numbers
int main()
{
  int a,b;
  cout << "Enter two number to find maximum among them: ";
  cin >> a;
  cin >> b;
  max(a,b);//This is the function call with 2 arguments to find maximum among them
  return 0;
}
void max(int a,int b)//Function definition
{
	if(a==b)//Both are equal
		cout << "Both are equal" << endl;
	else if(a>b)//a value is greater
		cout << "Max value is: " << a << endl;
	else//b value is greater
		cout << "Max value is: " << b << endl;
}
