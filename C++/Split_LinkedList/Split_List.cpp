#include<stdio.h>
#include<stdlib.h>
typedef struct node *list;
struct node
{
	int data;
	list link;
};
list head=0;
void display()
{
	printf("Elements in linked list are:\n");
	list temp=head;
	while(temp!=0)
	{
		printf("\t\t%d\n",temp->data);
		temp=temp->link;
	}
}
void split_list()
{
	list current=head,temp,head2=NULL,dummy;
	if(current->link->link==NULL)//If list has only 2 elements
	{
		dummy=current->link;//Assign next node of current to dummy node
		current->link=NULL;//make current link pointer to null
		dummy->link=NULL;//make dummy link pointer to null
		head2=dummy;//make dummy node has head2
	}
	else//If list contains more than 2 elements
	{
		while(current->link->link!=NULL)//Iterate upto 2nd last node
		{
			dummy=current->link;//assign next node of current to dummy node
			current->link=dummy->link;//make current pointing to next node of dummy 
			dummy->link=NULL;//make dummy pointing to NULL
			if(head2==NULL)//If list is empty make dummy as head
			{
				head2=dummy;
				temp=head2;//assign head2 to temp
			}
			else//If list is not empty
			{
				temp->link=dummy;//append dummy node at the end of list
				temp=temp->link;//Move temp pointer to next node
			}
			current=current->link;//move current pointer to next node
		}
		//Now there are last 2 nodes in actual list to seperate
		dummy=current->link;//Assign next node of current to dummy node
		current->link=NULL;//make current link pointer to null
		temp->link=dummy;////append dummy node at the end of list
	}	
	/*Printing two lists*/
	printf("\n************Liked list pointed by head1*********\n");
	temp=head;
	while(temp!=NULL)
	{
		printf("\t\t%d\n",temp->data);
		temp=temp->link;
	}
	printf("\n************Liked list pointed by head2*********\n");
	temp=head2;
	while(temp!=NULL)
	{
		printf("\t\t%d\n",temp->data);
		temp=temp->link;
	}
}
main()
{
	int ch;
	head=(list)malloc(sizeof(struct node));
	printf("Enter head data:\t");
	scanf("%d",&head->data);
	list temp=head;
	printf("%d",head->data);
	/*do
	{
		temp->link=(list)malloc(sizeof(struct node));
		printf("Enter next item:\t");
		scanf("%d",&temp->link->data);
		temp->link->link=0;
		temp=temp->link;
		printf("press 1 to continue:\t");
		scanf("%d",&ch);
	}while(ch==1);
	display();
	split_list();*/
}
