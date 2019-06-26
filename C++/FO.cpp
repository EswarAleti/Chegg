#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main() 
{
	ifstream file("words.txt");
	string outputData=" ";
	string content;
	int noOfWords=0;
	while(file >> content) 
	{
		cout << content << endl;
		noOfWords++;
	}
	outputData+=noOfWords;
	cout << noOfWords;
	return 0;
}
