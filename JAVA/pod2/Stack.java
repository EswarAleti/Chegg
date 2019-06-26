import java.util.NoSuchElementException;

public class Stack
{
   private Node head;
   class Node
   {
       public String data;
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
   //Insert each node before head
   //It is easy to Pop()
   public void push(String c)
   {
       //Creating a new node
       Node newNode = new Node();
       newNode.data = c;//assigning data to node
       newNode.next = head;//insert before head
       head = newNode;//make it as head
   }
   /**
   * Removes the element from the top of the stack
   * @return the removed String
   */
   public String pop()
   {
       //If list is empty then prompt underflow
       if (head == null)
       {
           System.out.println("UnderFlow");
           return "";   
        }
       String c = head.data;
       //making next node of head as head i.e. removing last insrted element from list
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
           //Data is in reverse order in the list
           //so we need to append before the output to get actual order
           output = position.data + "\n" +output;
           position = position.next;
       }
       return output;
   }
}

