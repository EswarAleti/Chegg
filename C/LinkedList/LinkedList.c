#include<stdio.h>
#include<stdlib.h>
struct record
{
    int accountno;
    char name[25];
    char address[80];
    struct record* next;
};
struct record *start=0,*temp;
void addRecord(struct record *new_record)
{
    //If list is empty make new_record as start node
    if(start==0)
    {
        start= new_record;
        temp=start;
    }
    //Compare with start node if new_record has less account number make it as start node
    else if(new_record->accountno < start->accountno)
    {
        new_record->next = start;
        start=new_record;
    }
    else
    {
        temp=start;
        //used to find whether the new_record inserted or not
        int is_inserted=0;
        while(temp->next!=0)
        {
            //if new_record has less account number then insert after temp node

            //make is_inserted as 1
            if(new_record->accountno < temp->next->accountno)
            {
                new_record->next = temp->next;
                temp->next = new_record;
                is_inserted=1;
                break;
            }
            //else move to next node
            else
                temp=temp->next;
        }
        //if new_record not inserted yet i.e. new_record has max account number than all
        //Then insert it at last
        if(is_inserted==0)
        {
            temp->next = new_record;
        }
    }
}
void display()
{
    temp=start;
    //Display the content of the list
    while(temp!=0)
    {
        printf("%d \n%s \n%s\n",temp->accountno,temp->name, temp->address);
        temp=temp->next;
    }
}
int main()
{
    int choice;
    //User input
    do
    {
        struct record *new_record = (struct record*)malloc(sizeof(struct record));
        
        printf("Enter user account number: ");
        scanf("%d",&new_record->accountno);
        printf("Enter user name: ");
        char ch;
        scanf("%c",&ch);
        scanf("%[^\n]s",new_record->name);
        printf("Enter user adress: ");
        scanf("%c",&ch);
        scanf("%[^\n]s",new_record->address);
        new_record->next=0;
        
        addRecord(new_record);
        
        printf("Enter 1 to continue:\t");
        scanf("%d",&choice);
    }while(choice==1);
    
    display();
    return 0;
}
