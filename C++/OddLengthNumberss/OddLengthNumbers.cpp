#include<iostream>
using namespace std;
int main()
{
   //digitCount is used to count the number of digits in the number
   int n,digitCount=0;
   //User input
   cout<<"Enter number: ";
   cin >> n;
   //Iterate until n becomes 0
   while(n>0)
   {
       //increment the digitCount
       digitCount++;
       // reduce number by one digit
       n=n/10;
   }
   //If digit count is odd then accept
   if(digitCount%2!=0)
       cout<<"Accepted"<<endl;
   else
       cout<<"Not accepted"<<endl;
}
