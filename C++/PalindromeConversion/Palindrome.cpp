#include<iostream>
using namespace std;
bool isPalindrome(string str)
{
	int len = str.length()-1;
	//traverse entire string
	for(int i=0;i<=len;i++)
	{
		//characters at position i and (len-i) should be same
		//otherwise return false
		if(str.at(i)!=str.at(len-i))
			return false;
	}
	//we came here when str is a palindrome
	return true;
}
//convertToPalindrome() method returns a palindrome with minimum number of changes
//If multiple results then returns first word in alphabetical order
string convertToPalindrome(string str)
{
	int len = str.length()-1;
	//traverse entire string
	for(int i=0;i<=len;i++)
	{
		//if characters not matches
		if(str.at(i)!=str.at(len-i))
		{
			//replace higher character with lower character
			//becasue we want alphabetically first word
			//for example b>a so replace b with a
			if(str.at(i)>str.at(len-i))
				str.at(i) = str.at(len-i);
			//a<b so replace b t==with a
			else
				str.at(len-i) = str.at(i);
		}
	}
	return str;
}
int main()
{
	string str;
	cout<<"Enter string: ";
	cin>>str;
	if(isPalindrome(str))
		cout<<"Palindrome"<<endl;
	else
		cout<<convertToPalindrome(str);
	return 0;
}
