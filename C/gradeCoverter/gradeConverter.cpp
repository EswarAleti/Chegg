#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
	int grade;
	cout << "Input Grade (60-100): ";
	cin >> grade;
	//If given input is valid then print the result
	if(grade>=60 && grade<=100)
	{
		// setprecision(1) is to print 1 as 1.0 3 as 3.0
		cout<<"Converted grade (0.0 to 4.0):" << fixed << setprecision(1) <<(grade-60)/10.0 << endl;
	}
	//If input not in the range promt that input is invalid
	else
	{
		cout<<"Invalid input"<<endl;
	}
	return 0;
}
