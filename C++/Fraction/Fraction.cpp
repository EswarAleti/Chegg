#include <iostream>
#include <string.h>
using namespace std;
int LCM(int a,int b)//Function to find LCM of two numbers
{
	int max=a>b?a:b;//Start from max among two numbers
	while(true)//iterate until LCM found
	{
		if(max%a==0 && max%b==0)
			return max;
		max++;
	}
}
int main()
{
	int num;
	cin >> num;
	int count=0;
	for (int i=num+1; i<=2*num ; i++)
	{
		int lcm=LCM(num,i);
		int diff=(lcm/num)-(lcm/i);
		if(num%diff==0)
		{
			count++;
			cout << i << ", " << lcm/diff << endl;
		}
	}
	cout << "Total possible "<< count <<endl;
    return 0;
}
