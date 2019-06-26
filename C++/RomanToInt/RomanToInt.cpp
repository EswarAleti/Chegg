#include <fstream>
#include<iostream>
#include <sstream>
#include <string>
using namespace std;
//this funciton eturns value of roman character
int getValue(char ch) 
{ 
    if (ch == 'I') 
        return 1; 
    if (ch == 'V') 
        return 5; 
    if (ch == 'X') 
        return 10; 
    if (ch == 'L') 
        return 50; 
    if (ch == 'C') 
        return 100; 
    if (ch == 'D') 
        return 500; 
    if (ch == 'M') 
        return 1000; 
    return -1; 
} 
int romanToInt(string roman)
{
	//sum stores the final result of roman number
	int sum=0,index=0,val1,val2;
	//Iterate until string ends
	while(roman.at(index)!='$')
	{
		//get value of roman character at index
		val1 = getValue(roman.at(index));
		//get value of roman character at index+1 if exist
		if(roman.at(index+1)!='$')
		{
			val2 = getValue(roman.at(index+1));
			//if first character is greater than just add val1
			if(val1>=val2)
				sum+=val1;
			//If first character is less than second for ex: IX , XL
			else
			{
				sum+=val2-val1;
				index++;
			}
		}
		//Add value of last roman character
		else
		{
			sum+=val1;
		}
		//increment the index
		index++;
	}
	return sum;
}
int main()
{	
	//file reading
	ifstream infile("Roman.txt");
	//result stroes the output to write onto file
	string roman,result="";
	//Read till the end of file
	while (infile >> roman)
	{
		//Integer to string
		ostringstream str1;
		//function calling
		str1<<romanToInt(roman);
		//copy to result and add new line at the end
		result+=str1.str()+"\n";
	}
	//eliminate last new line
	result=result.substr(0,result.length()-1);
	//File writing
	ofstream myfile;
  	myfile.open ("Roman1.txt");
  	myfile<<result;
  	//close the file
  	myfile.close();
	return 0;
}
