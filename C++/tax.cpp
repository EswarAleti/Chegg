#include <iostream>
#include <iomanip>
using namespace std;
int main() 
{
        double tax;
        double income;
        string status;

        cout<<"Enter your married status (Single/Married): ";
        cin>>status;
        cout<<"Enter your taxable income: ";
        cin>>income;
        if(status=="Single")
        {
        	//calculate tax for entire income
            if(income>0 && income<=8000)
            {
                tax = 0.10 * income;
            }
            //calculate tax for income over 8000 and then add 800 to taxed amount
            else if(income>8000 && income<=32000)
            {
                tax = (0.15 * (income-8000)) + 800;
            }
            //calculate tax for income over 32000 and then add 4400 to taxed amount
            else if(income>32000)
            {
                tax = (0.25 * (income-32000)) + 4400;
            }
        }
        else if(status == "Married")
        {
        	//calculate tax for entire income
	        if(income>0 && income<=16000)
            {
            	tax = 0.10 * income;
            }
            //calculate tax for income over 16000 and then add 1600 to taxed amount
            else if(income>16000 && income<=64000)
            {
                tax = (0.15 * (income-16000)) + 1600;
            }
            //calculate tax for income over 64000 and then add 8800 to taxed amount
            else if(income>64000)
            {
                tax = (0.25 * (income-64000)) + 8800;
            }
        }
        cout<<fixed<<setprecision(2)<<"Tax is: $"<<tax;
}
