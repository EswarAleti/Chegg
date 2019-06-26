#include<iostream>
#include<cstdlib>
#include <ctime>
using namespace std;
int main()
{
	int min=1, max=20;
	//Assumed that random number is generated in between 1 and 0
	char choice;
    cout << "output: Would you like to (p)lay or watch the (c)omputer play or (q)uit?"<<endl;
    cout << "input: ";
    cin >> choice;
	srand(time(NULL));
	//generating random number with in the range min and max
    int num = (rand()%(max-min+1))+min;
    if(choice=='c')
    {
    	while(true)
    	{
	    	int predictedNum = (rand()%(max-min+1))+min;
	    	if(num ==  predictedNum)
	    	{
	    		cout << "output: the computer guess is " << predictedNum << endl;
	    		cout << "output: congrats, you've guess right." << endl;
	    		break;
			}
			//If user guess is high then we need to predict number beow the predictedNum
			else if(predictedNum>num)
			{
				cout << "output: the computer guess is " << predictedNum << endl;
				cout << "output: sorry your guess is too high." << endl;
				max=predictedNum-1;
			}
			//If user guess is low then we need to predict number above the predictedNum
			else
			{
				cout << "output: the computer guess is " << predictedNum << endl;
				cout << "output: sorry your guess is too low." << endl;
				min=predictedNum+1;
			}
		}
	}
	else if(choice == 'p')
	{
		while(true)
    	{
	    	int predictedNum;
			cout << "output: user guess is :";
			cin >> predictedNum;
	    	if(num ==  predictedNum)
	    	{
	    		cout << "output: the your guess is " << predictedNum << endl;
	    		cout << "output: congrats, you've guess right." << endl;
	    		break;
			}
			else if(predictedNum>num)
			{
				cout << "output: the your guess is " << predictedNum << endl;
				cout << "output: sorry your guess is too high." << endl;
			}
			else
			{
				cout << "output: the your guess is " << predictedNum << endl;
				cout << "output: sorry your guess is too low." << endl;
			}
		}
	}
    return 0;
}

