#include<iostream>
using namespace std;
void printPattern(int n)
{
	if(n<=2)
	{
		cout << "Please enter a digit greater than 2." <<endl;
		return;
	}
	cout << "Output: " << endl;
	//Divide patter into two parts as upper triangle and lower triange
	//Upper traingle n=4
	//    *
	//   ***
	//  *****
	// *******
	for(int i=1;i<=n;i++)//Number of lines=n
	{
		for(int j=n-i;j>=1;j--)//Print n-i spaces on each line
			cout << " ";
		for(int j=1;j<=(2*i-1);j++)//print 2*i-1 asteric(*) on each line
			cout << "*";
		//new line after each iteration
		cout<<"\n";
	}
	//Lower triangle n=4
	// *****
	//  ***
	//   *
	for(int i=1;i<=n-1;i++)//number of line=n-1
	{
		for(int j=1;j<=i;j++)//print i spcaes in each line
			cout << " ";
		for(int j=1;j<=(2*(n-i)-1);j++)//print 2*(n-i)-1 astric(*) on each line
			cout << "*";
		//new line after each iteration
		cout<<"\n";
	}
}
int main()
{
	int n;
	while(true)
	{
		cout<<"Input: ";
		cin>>n;
		//if n=-1 then break the loop and say GoodBye!
		if(n==-1)
		{
			cout << "GoodBye!" << endl;
			break;
		}
		//Function calling
		printPattern(n);
	}
}
