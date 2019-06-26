#include<iostream>
#include<bits/stdc++.h>
using namespace std;
//getSubstrings function definition it returns vector of strings
vector<string> getSubstrings(string str)
{
	//stroe length of input string into len variable
	int len = str.length();
	//initialization of vector of strings
	vector <string> list;
	//for finding substrings we need to iterate for n^2 times
	for(int i=0;i<len;i++)
	{
		for(int j=1;j<=len-i;j++)
		{
			//find substring of str and store into string s
			string s=str.substr(i,j);
			char ch1=s[0],ch2=s[s.length()-1];
			//first character should be vowel
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u')
			{
				//last character should be a consonant
				if(ch2!='a' && ch2!='e' &&  ch2!='i' &&  ch2!='o' &&  ch2!='u')
					list.push_back(s);
			}
		}
	}
	//return vector
	return list;
}
int main()
{
	vector <string> list;
	//function calling and storing return vector in another vector named list
	list=getSubstrings("kslsksk");
	//sort the vector list
	sort(list.begin(), list.end());
	//printing
	for(int i=0;i<list.size();i++)
		cout<<list[i]<<endl;
}
