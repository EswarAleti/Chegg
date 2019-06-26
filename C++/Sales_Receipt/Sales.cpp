#include <iomanip>
#include<iostream>
using namespace std;
//function to print ouput with two parameters itemPrice Array and number of items
void salesReceipt(float [] , int);
int main()
{
    int noOfItems;
    cout << "How many sales items do you have ? : ";
    cin >> noOfItems;
    float itemPrices[noOfItems];
    //Input from user for item prices
    for(int i=0;i<noOfItems;i++)
    {
        cout << "Enter in the value of sales item " << i+1 <<" : $";
        cin >> itemPrices[i];
    }
    //To add some more items to list
    while(1)
    {
        //Output fucntion call
        salesReceipt(itemPrices,noOfItems);
        cout << "Enter 1 to add more items : " ;
        int temp;
        cin >> temp;
        //If user doesn't want to add more items then break the loop
        if(temp!=1)
            break;
        //If user ants to add more items then prompt for input
        cout << "Enter in the value of sales item " << noOfItems+1 <<": $";
        cin >> itemPrices[noOfItems];
        noOfItems++;
    }
    return 0;
}
void salesReceipt(float itemPrices[] , int noOfItems)
{
    float taxPercentage,totalPrice=0,taxAmount,grandTotal;
    cout << "Enter in the value of sales tax %  : ";
    cin >> taxPercentage;
    cout << "***************************************" << endl;
    cout << "************ SALES RECEIPT ************" << endl;
    cout << "***************************************" << endl;
    cout << "**                                   **" << endl;
    cout << "**                                   **" << endl;
    //setprecision to print upto  decimal points like .00
    for(int i=0;i<noOfItems;i++)
    {
cout << "**      Sales item    " << i+1 << "   $   " << setprecision (2) << fixed << itemPrices[i] <<"  **"; cout<< " "<<endl;
        totalPrice = totalPrice + itemPrices[i];//Sum up all prices
    }
    cout << "**                                   **" << endl;
    cout << "**                                   **" << endl;
    cout << "***************************************" << endl;
    cout << "**                                   **" << endl;
    cout << "**                                   **" << endl;
    
    cout << "**     Total Sales        $   " << totalPrice << " **" << endl;
    //Finding tax amount using below formula
    taxAmount = totalPrice * (taxPercentage/100);
    cout << "**     Sales Tax          $   " << taxAmount << "   **" << endl;
    //ROunding upto two decimal points
    grandTotal = (int)((totalPrice + taxAmount)*100)/100;
    cout << "**                            -----  **" << endl;
    cout << "**     Grand Total        $   " << grandTotal << " **"<<endl;
    cout << "**                                   **" << endl;
    cout << "**                                   **" << endl;
    cout << "***************************************" << endl;
}
