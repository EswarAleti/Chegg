#include<iostream>
using namespace std;
void printPatternEven(int n)
{
	cout << "Output: " << endl;
	//Divide patter into two parts as upper triangle and lower triange
	//Upper traingle n=8
	//    *
	//   * *
	//  * * *
	// * * * *
	//Lines required for each part
	int lines=(n/2);
	for(int i=1;i<=lines;i++)//Number of lines=n/2
	{
		for(int j=1;j<=lines-i;j++)//Print lines-i spaces on each line
			cout << " ";
		for(int j=1;j<=i;j++)//print i asteric(* ) on each line because even
			cout << "* ";
		//new line after each iteration
		cout<<"\n";
	}
	//Lower triangle n=8
	//* * * *
	// * * *
	//  * * 
	//   *
	for(int i=1;i<=lines;i++)//number of lines=lines=n/2
	{
		for(int j=1;j<=i-1;j++)//print i-1 spcaes in each line
			cout << " ";
		for(int j=1;j<=lines-i+1;j++)//print lines-i+1 astric(* ) on each line because even
			cout << "* ";
		//new line after each iteration
		cout<<"\n";
	}
}
void printPatternOdd(int n)
{
	cout << "Output: " << endl;
	//Divide patter into two parts as upper triangle and lower triange
	//Upper traingle n=7
	//    *
	//   ***
	//  *****
	// *******
	int lines=(n/2);
	for(int i=1;i<=lines+1;i++)//Number of lines=lines+1=n/2+1 for uooer triangle
	{
		for(int j=1;j<=lines-i+1;j++)//Print lines-i+1 spaces on each line
			cout << " ";
		for(int j=1;j<=(2*i-1);j++)//print 2*i-1 asteric(*) on each line because odd
			cout << "*";
		//new line after each iteration
		cout<<"\n";
	}
	//Lower triangle n=7
	// *****
	//  ***
	//   *
	for(int i=1;i<=lines;i++)//number of line=lines=n/2
	{
		for(int j=1;j<=i;j++)//print i spcaes in each line
			cout << " ";
		for(int j=1;j<=(2*(lines-i)+1);j++)//print 2*(lines-i)+1 astric(*) on each line because odd
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
		if(n<=2)
			cout << "Please enter a digit greater than 2." <<endl;
		//If input is even the call printPatternEven() 
		else if(n%2==0)
			printPatternEven(n);
		//If input is odd the call printPatternOdd()
		else
			printPatternOdd(n);
	}
}
