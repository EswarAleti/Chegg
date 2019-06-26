#include<stdio.h>
int t(int n)
{
	if(n==0)
		return 2;
	else if(n==1)
		return 1;
	return n+3*t(n-1)+t(n-2);
}
int main()
{
	printf("%d",t(3));
	return 0;
}
