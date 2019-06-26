import java.util.Scanner;
class CircularQueue
{
	//Intially rear and front should be initialized to -1
	public static int rear=-1,front=-1;
	//Here i assume size of cirular queue is 3
	public static final int size = 3;
	//Declaration of queue as myArray
	public static int[] myArray = new int[size];
	public static void main(String[] args) 
	{
		//Object creation for Scanner class for user input
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=5)
		{
			//Shwing functionalities and asking user for his choice
			System.out.print("\n1.enqueue\n2.dequeue\n3.isEmpty\n4.isFull\n5.Exit\nYour choice: ");
			//Input from user
			choice=sc.nextInt();
			//switch case to perform use tasks
			switch(choice)
			{
				case 1:
					//Enqueueing
					System.out.print("Enter element to Enqueue: ");
					int val = sc.nextInt();
					//Calling enqueue function to enqueue the element val
					enqueue(val);
					break;
				case 2:
					//Dequeueing
					//Calling dequeue() it retuns -1 if queue is empty otherwise it returns a value
					int num = dequeue();
					//If it returns value other than -1 print returned item
					if(num!=-1)
						System.out.println("Dequeued element is: "+num);
					break;
				case 3:
					//Checking for emptiness of queue
					if(isEmpty())
						System.out.println("Queue is empty");
					else
						System.out.println("Queue is not empty");
					break;
				case 4:
					//checking for fullness of queue
					if(isFull())
						System.out.println("Queue is Full");
					else
						System.out.println("Queue is not Full");
					break;
				default:
					System.out.println("Invalid input please try again");
					break;
			}
			//After every updation displaying() the queue
			display();
		}
	}
	public static void display()
	{
		//If queue is empty prompt message that Queue is empty
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("\nElements in Circular Queue are: ");
		// If rear is <= front then print queue elements from front to rear
		if (rear >= front)
	    {
	        for (int i = front; i <= rear; i++)
	            System.out.print(myArray[i] + " ");
	    }
	    //Else print front to size and then 0 to rear
	    else
	    {
	        for (int i = front; i < size; i++)
	            System.out.print(myArray[i] + " ");
	 
	        for (int i = 0; i <= rear; i++)
	            System.out.print(myArray[i] + " ");
	    }
	}
	public static void enqueue(int val)
	{
		//If queue is full we cannot perform enqueue operation so prompy Overflow and return
		if(isFull())
		{
			System.out.println("Overflow!");
			return;
		}
		// move rear value further
		rear = (rear+1)%size;
		//Inserting val at rear of the queue
		myArray[rear] = val;
		//If front==-1 i.e. queue is empty so make front as 0
		if(front == -1)
			front = 0;
	}	
	public static int dequeue()
	{
		// If queue is empty we cannot perform dequeue opeartion so prompt underflow and return
		if(isEmpty())
		{
			System.out.println("Underflow!");
			return -1;
		}
		// remove val from front of queue
		int num = myArray[front];
		// move frint value futher
		front = (front+1)%size;
		// If rear==front-1 i.e. for queue is empty now, if queue is empty rear,front should be set to -1
		if(rear == front-1)
		{
			rear = -1;
			front =- 1;	
		}
		return num;
	}
	public static boolean isEmpty()
	{
		//If front==-1 i.e. Queue is empty
		if(front == -1)
			return true;
		else
			return false;
	}
	public static boolean isFull()
	{
		//Below condition is for full
		if((rear == size-1 && front==0) || rear == front-1)
			return true;
		else
			return false;
	}
}