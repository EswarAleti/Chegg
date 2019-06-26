#include<iostream>
#include <sstream>
using namespace std;
int occurances(string,char);
int main()
{
   string strRates;
   cout << "Enter strRates: ";
   cin >> strRates;//"e.g. 5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;";
   //Number of columns depends on number of occurances of 'L'
   int cols = occurances(strRates,'L');
   //Number of rows depends on number of occurances of ','
   int rows = occurances(strRates,',');
   //To find exact number of rows follow the formula
   rows = ((rows / cols) + 3)/2 ;
   //Number of columns = occurances of L + 1 i.e. cols+1
   cols = cols + 1;
   //Now create an 2D array of strings with specified sizes as above cols,rows
   string arr[rows][cols];
   //At first index there is no element so for better alignment of output store 4 spaces
   arr[0][0]="    ";

   //start inserting from colIndex=1
   int colIndex=1;
   //string stream is used to divide string into tokens
   stringstream ss(strRates);
   // Iterate until string is parsed
   while( ss.good() && colIndex<cols )
   {
       // start inserting from rowIndex=1
       int rowIndex=1;
       //record is used to store a record of values like 5.0,100,5.5,101,6.0,102:L10
       //For entire code below assume record format as 5.0,100,5.5,101,6.0,102:L10
        string record;
        //It is used to divide the string with respect to ';'
        getline( ss, record, ';' );
    
        //find postion of L in a record to find the column lables
        int pos = record.find("L");
        //column lable is substring of record after L character e.g. 10 in 5.0,100,5.5,101,6.0,102:L10
        //So find the substring after L and store it in 0th row because column lables present at oth row
       arr[0][colIndex] = record.substr(pos + 1);
       //Now we need only 5.0,100,5.5,101,6.0,102 from 5.0,100,5.5,101,6.0,102:L10
       //So eliminate :L10 from record now below code on string of format 5.0,100,5.5,101,6.0,102
        stringstream ss(record.substr(0,pos-1));
        //Iterate untill entire record is parsed
        while(ss.good())
        {
           // Now our task is to divided into tokens by ',' character which gives actual values
           //And store it in array
           string attributeVal;
    
           //First value is lable of row e.g. 5.0
           getline( ss, attributeVal, ',' );
           arr[rowIndex][0] = attributeVal;
        
           //Second value is the value e.g. 100
           getline( ss, attributeVal, ',' );
           arr[rowIndex][colIndex] = attributeVal;
           //Increment rowIndex for storing next row of values
           rowIndex++;
       }
       //Increment colIndex for storing next column of values
       colIndex++;
   }

   //Printing the array
   for(int i=0;i<rows;i++)
   {
       for(int j=0;j<cols;j++)
       {
           cout << arr[i][j] << "   ";
       }
       cout <<"\n";
   }

   return 0;
}
//Function is to find occurances of a given character ch in string str
int occurances(string str, char ch)
{
   int count=0;
   for(int i=0;i<str.length();i++)
   {
       //If character found then increment count by 1
       if(str.at(i)==ch)
           count++;
   }
   return count;
}
