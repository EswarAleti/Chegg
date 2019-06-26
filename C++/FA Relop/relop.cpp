#include<iostream>
using namespace std;
int main()
{
	string op;
	//Taking input from user
	cin >> op;
	//Checking first two character is enough to decide which relational operator it is
	if(op[0]=='<')
	{
		//<= is Less than or equal (LE)
		if(op[1]=='=')
			cout << "LE" << endl;
		//<> is Not Equal(NE)
		else if(op[1]=='>')
			cout << "NE" << endl;
		//< is less than(LT)
		else
			cout << "LT" << endl;
	}
	//= is Equal (EQ)
	else if(op[0]=='=')
		cout << "EQ" << endl;
	else if(op[0]=='>')
	{
		//>= is Greater than or Equal(GE)
		if(op[1]=='=')
			cout << "GE" << endl;
		//> is Greater Than(GT)
		else
			cout << "GT" << endl;
	}
}
