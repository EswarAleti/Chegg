#include<iostream>
#include<cstdlib>
//#include <ctime>
using namespace std;
int main()
{
    int n=7;
    int arr[n];
    srand(time(NULL));//To get different random numbers on each run
    for(int i=0;i<n;i++)
    {
        //to get random numbers between specific range a,b we use (rand()%(max-min+1))+min
        arr[i]=(rand()%(20-15+1))+15;
    }
    while(true)//Iterates until user enters q or Q
    {
        cout << "[P]osition [R]everse [A]verage [S]earch [Quit]: " << endl;
        cout << "Please select an option: ";
        char ch;
        cin >> ch;//choice from user input
        if(ch=='Q' || ch=='q')//if user enter q or Q the quit
            break;
        else if(ch=='P' || ch=='p')//User enter p or P display position and value of elements in array
        {
            for(int i=0;i<n;i++)
                cout << i << "->" << arr[i] << endl;
        }
        else if(ch=='R' || ch=='r')//Display array in reverse order
        {
            for(int i=n-1;i>=0;i--)
                cout << i << "->" << arr[i] << endl;
        }
        else if(ch=='A' || ch=='a')//Find and display Average
        {
            float sum=0;
            for(int i=0;i<n;i++)
                sum=sum+arr[i];
            cout << sum/n << endl;
        }
        else if(ch=='S' || ch=='s')//Search for an element
        {
            int element;
            cout << "Enter element to search: ";
            cin >> element;
            bool found=false;
            int i=0;
            for(i=0;i<n;i++)
            {
                if(arr[i]==element)
                {
                    found=true;
                    cout << "Element found at index " << i << endl;
                }
            }
            if(found==false)//This means element not found
                cout << "Element not found" << endl;
        }
    }
    return 0;
}
