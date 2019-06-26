#include <fstream>
#include<iostream>
using namespace std;
int main()
{	
	ifstream infile("input.txt");
	string word;
	//Store each word into a string called word
	while (infile >> word)
	{
		//len used to store the length of the word
		int len = word.length();
		//plural which saves the plural form of the word
		string plural="";
		//If last letter is y then remove y and add ies to word
		if(word.at(len-1)=='y')
			plural = word.substr(0,len-1)+"ies";
		//If last two letters are ch (or) sh then add es to word
		else if((word.at(len-2)=='c' && word.at(len-1)=='h') || (word.at(len-2)=='s' && word.at(len-1)=='h') )
			plural = word+"es";
		//If last letter is s then add es to word
		else if(word.at(len-1)=='s')
			plural = word+"es";
		//add s to word otherwise
		else
			plural = word+"s";
		//show the output
		cout << "Plural of "<<word<<" is "<<plural<<endl;
	}
	return 0;
}
