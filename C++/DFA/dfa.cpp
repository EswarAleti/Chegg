#include<iostream>
using namespace std;
int main()
{
	string str;
	cin >> str;
	int state=-1;//- is initial state, 99 is deadstate
	for(int i=0;i<str.length();i++)
	{
		int ch;//getting each bit into ch
		if(str.at(i)=='0')
			ch=0;
		else
			ch=1;
		switch(state)//This works as finite machine where each case as a state
		{
			case -1:
				if(ch==1)//on 1 goto state 1
					state=1;
				else if(ch==0)//on o goto deadstate i.e 99
					state=99;
				break;
			case 0:
				if(ch==1)
					state=1;
				else if(ch==0)
					state=0;
				break;
			case 1:
				if(ch==1)
					state=3;
				else if(ch==0)
					state=2;
				break;	
			case 2:
				if(ch==1)
					state=0;
				else if(ch==0)
					state=4;
				break;
			case 3:
				if(ch==1)
					state=2;
				else if(ch==0)
					state=1;
				break;
			case 4:
				if(ch==1)
					state=4;
				else if(ch==0)
					state=3;
				break;
			case 99:
				break;
		}
	}
	if(state==0)//At the end of parsing string accpted if it is at state 0
		cout << "Accepted" << endl;
	else//else not accepted
		cout << "Not accepted" << endl;
	return 0;
}
