import java.io.*;
public class LinkedList 
{ 
	Node head;	
	static class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		
		Node new_node = new Node(data); 
		new_node.next = null; 
		if (list.head == null) 
		{ 
			list.head = new_node; 
		} 
		else 
		{ 
			Node last = list.head; 
			while (last.next != null) 
			{ 
				last = last.next; 
			} 
			last.next = new_node; 
		} 
		return list; 
	} 
	public static void displayList(Node temp) 
	{ 
		while (temp != null) 
		{
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		}
		System.out.println(); 
	}
	public static void splitList(LinkedList list)
	{
		Node currNode,head1=null,head2=null,last1=null,last2=null;
		currNode=list.head;
		//Iterate ove list
		while(currNode!=null)
		{
			//If there is a node remains in list
			if(currNode.next!=null)
			{
				//if list1 is empty
				if(head1==null)
				{
					head1=currNode.next;
					last1=head1;
				}
				else
				{
					//add the next node of list to list1
					last1.next=currNode.next;
					last1=last1.next;
				}
				//skip the middle node and move
				currNode.next=currNode.next.next;
			}
			if(currNode.next!=null)
			{
				//If list2 is empty
				if(head2==null)
				{
					head2=currNode.next;
					last2=head2;
				}
				else
				{
					//add the next node of list to list1
					last2.next=currNode.next;
					last2=last2.next;
				}
				//skip the middle node and move
				currNode.next=currNode.next.next;
			}
			//set end of list1, list2 to null
			last1.next=null;
			last2.next=null;
			//move to next node
			currNode=currNode.next;
		}
		//Displaying results
		System.out.print("List1: ");
		displayList(list.head);
		System.out.print("List2: "); 
		displayList(head1);
		System.out.print("List3: "); 
		displayList(head2);
	} 
	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8);
		list = insert(list, 9);
		list = insert(list, 10);
		list = insert(list, 11);
		list = insert(list, 12);
		list = insert(list, 13);
		list = insert(list, 14);  
		splitList(list); 
	} 
} 
