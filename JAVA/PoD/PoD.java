import java.util.Scanner;
public class PoD
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       Stack parentheses = new Stack();
       String input = in.nextLine();
       for(int i=0;i<input.length();i++)
       {
           char ch= input.charAt(i);//returns character at 'i'th index of the string
           if(ch=='(' || ch=='{' || ch=='[')//If open parentheses then push
               parentheses.push(ch);
           else if(ch==')' || ch=='}' || ch==']')//If closed parentheses
           {
               if(parentheses.empty()==true)//If stack is empty promp Not balanced
               {
                   System.out.println("Not Balanced");
                   System.exit(1);//Exit if Not balanced do not process further
               }
               else//Else pop from stack
               {
                       //If ) occured top of the stack should be (
                       if(ch==')' && parentheses.peek()!='(')
                       {
                           System.out.println("Not Balanced");
                           System.exit(1);//Exit if Not balanced do not process further
                       }
                       //If ] occured top of the stack should be [
                       else if(ch==']' && parentheses.peek()!='[')
                       {
                           System.out.println("Not Balanced");
                           System.exit(1);//Exit if Not balanced do not process further
                       }
                       //If } occured top of the stack should be {
                       else if(ch=='}' && parentheses.peek()!='{')
                       {
                           System.out.println("Not Balanced");
                           System.exit(1);//Exit if Not balanced do not process further
                       }
                       parentheses.pop();
               }
           }
       }
       if(parentheses.empty()==true)//If Stack is empty prompt Balanced
           System.out.println("Balanced");
       else//Else prompt not balanced
           System.out.println("Not Balanced");
   }
}