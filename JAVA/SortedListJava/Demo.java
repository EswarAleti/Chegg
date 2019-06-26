import java.util.Scanner;
class Node
{
	int data;
	Node next;
	public Node()
	{
		next = null;
		data = 0;
	}    
	public Node(int d,Node n)
	{
		data = d;
		next = n;
	}    
	public void setLink(Node n)
	{
		next = n;
	}    
	/* to set data to current Node */
	public void setData(int d)
	{
		data = d;
	}    
	/* to get link to next node */
	public Node getLink()
	{
		return next;
	}    
	/* to get data from current Node */
	public int getData()
	{
		return data;
	}
}

class sortedList
{
	Node head;
	public sortedList()
	{
		head=null;
	}
	/*  Function to insert an element  */
	public void insert(int val)
	{
		Node newNode, node, temp = null;
		newNode = new Node(val, null);
		boolean ins = false;//To check whether insertion occured or not
		/* If list is empty make newNode as head */
		if (head == null)
		   head = newNode;
	    /* If the newNode data is smaller than head make newNode as head */
		else if (val <= head.getData())
		{
			newNode.setLink(head);
			head = newNode;
		}
		/* Traverse entire list to place the newNode */
		else
		{
			temp = head;
			node = head.getLink();
			while(node != null)
			{
				/* If newNode data is fit in between two node */
				if (val >= temp.getData() && val <= node.getData())
				{
					temp.setLink(newNode);
					newNode.setLink(node);
					ins = true;
					break;
				}
				/* Else move to right node */
				else
				{
					temp = node;
					node = node.getLink();
				}
			}
			/* If newNode value is maximum insert it at righmost of list */
			if (ins == false)
			{
				temp.setLink(newNode);
			}
		}
	}
	public void display()
	{
		System.out.print("Sorted Singly Linked List = ");
		if (head.getLink() == null) 
		{
			System.out.println(head.getData() );
			return;
		}
		Node node = head;
		System.out.print(head.getData()+ "->");
		node = head.getLink();
		while (node.getLink() != null) 
		{
			System.out.print(node.getData()+ "->");
			node = node.getLink();
		}
		System.out.print(node.getData()+ "\n");
	}
}
class Demo
{
	public static void main(String[] args)
	{             
		Scanner scan = new Scanner(System.in);
		/* Creating object of sortedList */
		sortedList sList = new sortedList();
		int range=6;//For 6 numbers
		while(range>0)
		{
			System.out.println("Enter number to insert: ");
			sList.insert( scan.nextInt() );                     
			sList.display();
			range--;
		}
	}
}