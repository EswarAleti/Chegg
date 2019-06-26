#include <fstream> 	//For file operations
#include<iostream>	//For input output operations
#include <sstream>	//For string to integer conversions
#include <iomanip>	//For rounding of decimal number
using namespace std;
int main()
{	
	//file reading
	ifstream infile("random_numbers.txt");
	//var is string which stores integer
	string var;
	int sum=0,count=0,val;
	//Read till the end of file
	while (infile >> var)
	{
		//convert var to integer
		stringstream number(var);
		number>>val;
		//add val to sum
		sum=sum+val;
		//increment the count
		count++;
	}
	//closing the file
	infile.close();
	//output the numebr of integer in file
	cout<<"There are "<<count<<" numbers in the file"<<endl;
	//calculating average
	double avg = (double)sum/count;
	//setprecision(2)<<fixed to round the average upto 2 decimal places
	cout<<"The sum is "<<sum<<" and the average is "<<setprecision(2)<<fixed<< avg<<endl;
	return 0;
}
