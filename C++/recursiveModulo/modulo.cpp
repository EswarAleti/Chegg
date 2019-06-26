#include<iostream>
using namespace std;
int modulo(int n,int m)
{
	//denominator should not be 0
	if(m==0)
		return -1;
	//if n is greater than m then reduce n by subtracting with m
	if(n>=m)
		return modulo(n-m,m);
	//if n is smaller than m then n is the result
	else
		return n;
}
int main()
{
	//function calling and output printing
	cout<<modulo(77,6)<<endl;
	cout<<modulo(17,3)<<endl;
	cout<<modulo(773,16)<<endl;
	cout<<modulo(747,2)<<endl;
	return 0;
}
