#include<iostream>
#include<stdlib.h>
using namespace std;
//Node Declaration
struct node
{
	string name;
	string id;
	int score;
	node *next;	
};
//List class
class list
{
		private:
		//head represents start node, tail represent last node
		node *head, *tail;
		public:
		list()
		{
			head=NULL;
			tail=NULL;
		}
		void createnode(string name,string id,int score)
		{
			//Create a new node temp with passed data
			node *temp=new node;
			temp->name=name;
			temp->id=id;
			temp->score=score;
			temp->next=NULL;
			//If list is empty then temp will be the node
			if(head==NULL)
			{
				head=temp;
				tail=temp;
				temp=NULL;
			}
			//append temp at end of the list
			else
			{	
				tail->next=temp;
				tail=temp;
			}
		}
		void display(string id)
		{
			node *temp=new node;
			temp=head;
			//Traverse entire list
			while(temp!=NULL)
			{
				//if We found the key print details and returns
				if(temp->id==id)
				{
					cout<<"Name:"<<temp->name<<endl;
					cout<<"ID:"<<temp->id<<endl;
					cout<<"Grade:"<<getGrade(temp->score)<<endl;
					return;
				}
				//Move to next node
				temp=temp->next;
			}
			//We come here when key is not found
			cout << "ID not found";
		}
		//Funcntion for grading
		string getGrade(int score)
		{
			if(score<=100 && score>=93)
				return "A";
			else if(score<=92 && score>=90)
				return "A-";
			else if(score<=89 && score>=87)
				return "B+";
			else if(score<=86 && score>=83)
				return "B-";
			else if(score<=79 && score>=77)
				return "C+";
			else if(score<=76 && score>=73)
				return "C";
			else if(score<=72 && score>=70)
				return "C-";
			else if(score<=69 && score>=67)
				return "D+";
			else if(score<=66 && score>=60)
				return "D";
			else
				return "F";
		}
		void deleteRecord(string id)
		{
			node *temp=new node;
			node *prev=new node;
			temp=head;
			//If id at head, move head to next node
			if(temp!=NULL && temp->id==id)
			{
				head=temp->next;
				free(temp);
				return;
			}
			//iterate untill id found 
			while (temp != NULL && temp->id != id) 
		    { 
		        prev = temp; 
		        temp = temp->next; 
		    }
		    //we come here when id not found
			if(temp==NULL)
			{
				cout << "ID not found";
				return;
			}
			//delete temp node
			prev->next=temp->next;
			free(temp); 			
		}
};
int main()
{
	list obj;
	int choice,score;
	string name,id;
	while(true)
	{
		cout << "\n1.Insert\n2.Display\n3.Delete\n4.exit: ";
		cin >> choice;
		if(choice==1)
		{
			cout << "Enter name: ";
			cin >> name;
			cout << "Enter id: ";
			cin >> id;
			cout << "Enter score: ";
			cin >> score;
			obj.createnode(name,id,score);
		} 
		else if(choice==2)
		{
			string searchId;
			cout << "Enter ID to Display: ";
			cin >> searchId;
			obj.display(searchId);
		}
		else if(choice==3)
		{
			string searchID;
			cout << "Enter ID to delete record: ";
			cin >> searchID;
			obj.deleteRecord(searchID);
		}
		else
			break;
	}
	return 0;
}
