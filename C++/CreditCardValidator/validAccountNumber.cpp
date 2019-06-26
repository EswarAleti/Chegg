#include<iostream>
using namespace std;
int main()
{
	string accNum;
	cout << "Enter account number: ";
	cin >> accNum;
	int sum=0;
	//Iterate entire account number
	for(int i=0;i<accNum.length();i++)
	{
		//convert digit to number
		int digit= accNum.at(i) - '0';
		//double thedigits at odd positions
		if(i%2!=0)
		{
			//After doubling the digit if it is greater than 9 then remove 9 from it
			if(2*digit>9)
				sum = sum + (2*digit-9);
			//Else just add double of digit
			else
				sum=sum+2*digit;
		}
		//Add digits at even positions
		else
			sum=sum+digit;
	}
	//find last digit x which satisifies our conditions
	for(int x=0;x<10;x++)
	{
		//If sum+x divisible by 10 then print it and break
		if((sum+x)%10==0)
		{
			//output
			cout << "The last digit, "<< x <<", is the check digit."<<endl;
			break;
		}
	}
	return 0;
}
