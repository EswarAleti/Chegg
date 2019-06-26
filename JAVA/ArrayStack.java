import java.util.Scanner;
@SuppressWarnings("unchecked")
class ArrayStack<AnyType> implements StackInterface<AnyType>
{
   private static final int DEFAULT_CAPACITY = 15;
   private int top;       // reference to the top element
   private AnyType[] A;
   public ArrayStack(int initialCapacity)
   {
        A = (AnyType[]) new Object[initialCapacity];
		top = -1;   //stack is empty
   }
   public ArrayStack()
   {
      this(DEFAULT_CAPACITY);
   }
   public boolean isEmpty()
   {
      return top==-1;
   }
   public AnyType peek()
   {
	   return A[top];
   }
   public AnyType pop()
   {
	  if(top==-1)
		System.out.println("UnderFlow");
      return A[top--];
   }
   public void push(AnyType e)
   {
      if (top == A.length)
		  System.out.println("OverFlow");
      A[++top] = e;
   }

   public String toString()
   {
      if(isEmpty()) return "[ ]";
      StringBuffer out = new StringBuffer("[");
      for(int i = 0; i < top; i++)
         out.append(A[i] + ", ");
      out.append(A[top] + "]");
      return out.toString();
   }

   public static void main(String[] args)
   {
      ArrayStack<Integer> s = new ArrayStack<Integer>(6);
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter Pushing element: ");
				int element=sc.nextInt();
				s.push(element);
			}
			else if(choice==2)
				s.pop();
			else if(choice==3)
				System.out.println(s);
		}while(choice!=4);
   }
}
/**              StackInterface           **/
interface StackInterface<AnyType>
{
	//checks whether stack is empty or not
	public boolean isEmpty();

	//Pop operation 
	public AnyType pop();

	//Push onto stock
	public void push(AnyType e);
	
	//Top of the stack
	public AnyType peek();
}
