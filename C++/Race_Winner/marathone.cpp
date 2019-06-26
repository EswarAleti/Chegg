#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    int noOfInputs;//Nummber of inputs per a testcase
    cin >> noOfInputs;
    if(noOfInputs==0)//If numOfInputs return with nothing
        return 0;
    int id[noOfInputs];//integer array for id
    string time[noOfInputs];//time array for storing time of racer
    for(int i=0;i<noOfInputs;i++)//Inputs from user
    {
        cin >> id[i];
        cin >> time[i];
    }
    //Sorting
    for(int i=0;i<noOfInputs;i++)
    {
        for(int j=i+1;j<noOfInputs;j++)
        {
            if(time[i]>time[j])//If time is less the swap respective time and id
            {
                string temp=time[i];
                time[i]=time[j];
                time[j]=temp;
                int temp2=id[i];
                id[i]=id[j];
                id[j]=temp2;
            }
        }
    }
    if(noOfInputs<=3)//if number if inputs less than 3 then print all with winning places
    {
        cout << "Output" << endl;
        for(int i=0;i<noOfInputs;i++)
            cout << id[i] << " " << time[i] << endl;
        return 0;
    }
    cout << "Output" << endl;
    for(int i=0;i<3;i++)
        cout << id[i] << " " << time[i] << endl;
    return 0;
}
