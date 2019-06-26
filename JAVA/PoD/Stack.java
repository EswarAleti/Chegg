import java.util.NoSuchElementException;
public class Stack
{
   private Node head;
   class Node
   {
       public char data;
       public Node next;
   }
   // Constructs an empty stack:
   public Stack()
   {
       head = null;
   }
   /**
   * Adds an element to the top of the stack
   * @param c character to add
   */
   public void push(char c)
   {
       Node newNode = new Node();
       newNode.data = c;
       newNode.next = head;
       head = newNode;
   }
   /**
   * Removes the element from the top of the stack
   * @return the removed String
   */
   public char pop()
   {
       if (head == null) {throw new NoSuchElementException();}
       char c = head.data;
       head = head.next;
       return c;
   }
   public boolean empty()
   {
       if (head == null)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   public String toString()
   {
       Node position = head;
       String output = "";
       while (position != null)
       {
           output += position.data + "\n";
           position = position.next;
       }
       return output;
   }

public char peek()
   {
       return head.data;
   }
}