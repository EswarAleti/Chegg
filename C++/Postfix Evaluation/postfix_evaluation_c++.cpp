#include <iostream>
#include <string.h>
using namespace std;
//Creating a structur called ndoe with an integer and a pointer to itself
struct node
{
    int data;
    node *next;
}*top=NULL,*newNode=NULL,*temp=NULL;//Initialieing top,newNode, temp node
void push(int val)
{
    newNode=new node;//newNode created
    newNode->data = val;//inserting data into stack
    newNode->next = NULL;//Make next null
    if (top == NULL)//If stack is empty then newNode is top
    {
        top = newNode;
    }
    else//insert newNode in front of top because pop will be easy
    {
        temp = top;
        top = newNode;
        top->next = temp;
    }
}
char pop()
{
    if (top == NULL)//If nothing is present in stack raise error
    {
        cout<<"underflow!!";
    }
    else//Else remove top of the stack and return
    {
        temp = top;
        top = top->next;
        return(temp->data);
        delete temp;
    }
}
int main()
{
    int testCase;
    cin >> testCase;//Input for number of testcases
    string postfixArray[testCase];//Creating a postfixArray to take postfix expression inputs from user
    for(int i=0;i<testCase;i++)
        cin >> postfixArray[i];
    int resultArray[testCase];
    for(int j=0;j<testCase;j++)//Evaluate for each postfixExpression
    {
        string str= postfixArray[j];//store postfix expression in str for easy convenience
        for(int i=0;i<str.length();i++)
        {
            char ch=str.at(i);//it stores character at ith index into ch
            if(ch>=48 && ch<=57)//If it is digit
                push(ch-'0');
            else if(ch>=42 && ch<=47)//If it is operator
            {
                int num2=pop();//Pop top of the stack and it is num2
                int num1=pop();//Pop top of the stack and it is num1
                switch(ch)
                {
                case '+':
                    push(num1+num2);
                    break;
                case '-':
                    push(num1-num2);
                    break;
                case '*':
                    push(num1*num2);
                    break;
                case '/':
                    if(num2!=0)      
                        push(num1/num2);
                    else
                    {
                        cout<< "Dividing with 0 undefined";
                        return 0;
                    }
                    break;
                default:
                    cout << "Invalid input" << endl;
                }
            }
        }
        resultArray[j]=pop();//store final result into resultArray at corresponding index
    }
    cout << "Output" << endl;
    for(int i=0;i<testCase;i++)
        cout << resultArray[i] << endl;
    return 0;
}    
