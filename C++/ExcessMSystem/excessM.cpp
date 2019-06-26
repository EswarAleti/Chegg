#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int M=3;
	cout<<"**********Excess "<<M<<" Converter********"<<endl;
	int decimal,maxRange,noOfBits;
	//ch defines whether to quit or continue
	//c for continue and q for quit
	char ch='c';
	while(ch=='c')
	{
		//Input for number of bits
		cout<<"Enter number of bits: ";
		cin>>noOfBits;
		//Formula to find max number that can be represented using Excess M system
		maxRange = pow(2,noOfBits)-(M+1);
		//Iterate until user entered a valid number with in the range
		while(true)
		{
			cout<<"Enter a number in base 10: ";
			cin>>decimal;
			//If number within the range then convert to Excess M system
			if(decimal>=0 && decimal<=maxRange)
			{
				cout<<"Excess "<<M<<" conversions of "<<decimal<<"is :";
				//Excess M is nothinf but adding M to decimal and the convert to binary
				decimal = decimal+M;
				//binary is to store the binary number
				int binary[noOfBits];
				//Store in reverse order
				for(int i=noOfBits-1;i>=0;i--)
				{
					binary[i]=decimal%2;
					decimal=decimal/2;
				}
				//Output the binary number in Excess M format
				for(int i=0;i<noOfBits;i++)
				{
					cout<<binary[i];
				}
				break;
			}
			else
				cout<<"Enter aq number within the range!"<<endl;
		}
		//Ask user to continue or quit
		cout<<"\nEnter q to quit and c to continue: ";
		cin>>ch;
	}	
	return 0;
}
