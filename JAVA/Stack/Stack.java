import java.util.NoSuchElementException;
 class Stack
{
   private Node top;
   private int count;
   class Node
   {
       public int data;
       public Node next;
   }
   // Constructs an empty stack:
   public Stack()
   {
       top = null;
	   count =0;
   }
   /**
   *Push operation:::::
   * Adds an element to the top of the stack
   * @param e int to top of stack.
   */
   public void push(int e)
   {
       Node newNode = new Node();
       newNode.data = e;
       newNode.next = top;
       top = newNode;
	   count++;
   }
   /**
   * Pop Operation::::
   * Removes the element from the top of the stack
   * @return the removed String
   * If stack empty throw NoSuchElementException
   */
   public int pop()
   {
       if (top == null) {throw new NoSuchElementException();}
       int e = top.data;
       top = top.next;
	   count--;
       return e;
   }
   public int  size()
   {
		return count;
   }
}