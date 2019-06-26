#include <fstream> 	//For file operations
#include<iostream>	//For input output operations
#include <sstream>	//For string to integer conversions
using namespace std;
int main()
{	
	//file reading
	ifstream infile("1994_ weekly_gas_averages.txt");
	string var;
	//index is for arr index
	int index=0;
	//arr declaration
	//0th index stores month, 1 index stores price
	double arr[52][2];
	//Read till the end of file
	while (infile >> var)
	{
		//for every line first part is month
		//convert string to double
		stringstream month(var);
		month>>arr[index][0];
		//for every line second part is price
		infile >> var;
		//convert string to double
		stringstream price(var);
		price>>arr[index][1];
		//increment the index
		index++;
	}
	//closing the file
	infile.close();
	//initializations
	double minPrice=arr[0][1],maxPrice=arr[0][1];
	int minMonth=arr[0][0],maxMonth=arr[0][0],minWeek=1,maxWeek=1;
	for(int i=1;i<52;i++)
	{
		//arr[i][1]<minPrice then update minPrice,minWeek,minMonth
		if(arr[i][1]<minPrice)
		{
			minPrice=arr[i][1];
			minMonth=arr[i][0];
			minWeek=i+1;
		}
		//arr[i][1]>maxPrice then update maxPrice,maxWeek,maxMonth
		if(arr[i][1]>maxPrice)
		{
			maxPrice=arr[i][1];
			maxMonth=arr[i][0];
			maxWeek=i+1;
		}
	}
	//output printing
	cout<<"Minimum price details: "<<endl;
	cout<<"                      Minimum price = "<<minPrice<<endl;
	cout<<"                      Month = "<<minMonth<<endl;
	cout<<"                      Week = "<<minWeek<<endl;
	cout<<"Maximum price details:"<<endl;
	cout<<"                      Maximum price = "<<maxPrice<<endl;
	cout<<"                      Month = "<<maxMonth<<endl;
	cout<<"                      Week = "<<maxWeek<<endl;
	//monthly average calculating
	for(int month=1;month<=12;month++)
	{
		//weekCOunt has number of weeks in month
		int weekCount=0;
		//sum stores the sum of the gac prices ina  month
		double sum=0;
		//calculate average for each month
		for(int i=0;i<52;i++)
		{
			if(month==arr[i][0])
			{
				sum=sum+arr[i][1];
				weekCount++;	
			}
		}
		//dispace average
		cout<<"Average gas price of month "<<month<<" is "<<sum/weekCount<<endl;
	}
	return 0;
}
