#include<iostream>
#include<cstdlib>
using namespace std;
class nodeType
{
	public:
		nodeType *next;
		int data;
		nodeType()
		{
			data=0;
			next=NULL;
		}
};
void print(nodeType *ptr)
{
	if(ptr==NULL)
		return;
	cout << ptr->data <<endl;
	print(ptr->next);
}
void printReverse(nodeType *ptr)
{
	if(ptr==NULL)
		return;
	printReverse(ptr->next);
	cout << ptr->data <<endl;
}
bool search(nodeType *ptr,int key)
{
	do
	{
		if(ptr->data==key)
			return true;
		ptr=ptr->next;
	}while(ptr!=NULL);
	return false;
}
int main()
{
	nodeType *first,*last;
	nodeType *newNode;
	int num;
	first=last=NULL;
	cout<<"enter number:";
	cin>>num;
	while(num>0)
	{
		newNode =new nodeType();
		newNode->data=num;
		newNode->next=NULL;
		if(first==NULL)
		{
			first=newNode;
			last=newNode;
		}
		else
		{
			last->next=newNode;
			last=newNode;
		}
		cout<<"enter number:";
		cin>>num;
	}
	cout<<"List from front to back"<<endl;
	print(first);
	cout<<"List from back to front"<<endl;
	printReverse(first);
	/*int key;
	while(true)
	{
		cout << "Enter search key:";
		cin>>key;
		cout<<search(first,key)<<endl;
	}*/
	return 0;
}
