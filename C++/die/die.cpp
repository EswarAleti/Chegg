#include<iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main()
{
	int seed,num1,num2,guess;
	//input for seed
	cout<<"Enter the seed of the random number generator : ";
	cin>>seed;
	srand(time(0));
	//Genearate two random numbers
	num1 = rand()%seed;
	num2 = rand()%seed;
	//If sum is even
	if((num1+num2)%2==0)
	{
		//first guess
		cout<<"The sum is even, you have three tries to get the sum . Enter first guess: ";
		cin>>guess;
		if(guess==(num1+num2))
			cout<<"Congratulations, sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
		else
		{
			//seconds guess
			cout<<"Incorrect. Try again: ";
			cin>>guess;
			if(guess==(num1+num2))
				cout<<"Congratulations, sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
			else
			{
				//third guess
				cout<<"Incorrect. Try again: ";
				cin>>guess;
				if(guess==(num1+num2))
					cout<<"Congratulations, sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
				else
					cout<<"Incorrect. The sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
			}
		}	
	}
	//If sum is odd
	else
	{
		//first guess
		cout<<"The sum is odd, you have two tries to get the sum . Enter first guess: ";
		cin>>guess;
		if(guess==(num1+num2))
			cout<<"Congratulations, sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
		//If sum is smaller than the guess
		else if(guess>(num1+num2))
		{
			cout<<"Incorrect. Hint: sum is smaller than "<<guess<<endl;
			cout<<"Incorrect. Try again: ";
			//second guess
			cin>>guess;
			if(guess==(num1+num2))
				cout<<"Congratulations, sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
			else
				cout<<"Incorrect. The sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
		}
		//If sum is greater than the guess
		else
		{
			cout<<"Incorrect. Hint: sum is larger than "<<guess<<endl;
			cout<<"Incorrect. Try again: ";
			//seconds guess
			cin>>guess;
			if(guess==(num1+num2))
				cout<<"Congratulations, sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
			else
				cout<<"Incorrect. The sum of "<<num1<<"+"<<num2<<" is "<<(num1+num2)<<endl;
		}
	}
	return 0;
}
