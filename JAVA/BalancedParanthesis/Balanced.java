import java.util.Stack;  
public class Balanced
{
   public static void main(String[] args)
   {
       //function calling and printing the respective boolean result
       //true means balanced, false means not balanced
       System.out.println("abc{de(fg){ijk}{l{m[n]}}o[p]}qr : "+isBalanced("abc{de(fg){ijk}{l{m[n]}}o[p]}qr"));
       System.out.println("abc{(def}}{ghij{kl}m] : "+isBalanced("abc{(def}}{ghij{kl}m]"));
       System.out.println("a*(b+c)-(d*e) : "+isBalanced("a*(b+c)-(d*e)"));
       System.out.println("(a*(b-c)*{d+e} : "+isBalanced("(a*(b-c)*{d+e}"));
   }
   public static boolean isBalanced(String s)
   {
       //if expression is empty ther return true ; base case
       if (s.isEmpty())
           return true;
       Stack<Character> stack = new Stack<Character>();
       //Scan each character of string
       for (int i = 0; i < s.length(); i++)
       {
           //Extract a character each time at index i of String s
           char currentCharacter = s.charAt(i);
           //If character us {,(,[ then push onto stack
           if (currentCharacter == '{' || currentCharacter == '(' || currentCharacter == '[')
           {
               stack.push(currentCharacter);
           }
           //If character is },),] then is shoud, match with top of the stack as {,(,[ respectively
           if (currentCharacter == '}' || currentCharacter == ')' || currentCharacter == ']')
           {
               //if stack empty then it is not balanced
               if (stack.isEmpty())
                   return false;
               //extract top of the stack
               char topOfStack = stack.peek();
               //and compare current character and top of stack
               if (currentCharacter == '}' && topOfStack == '{' || currentCharacter == ')' && topOfStack == '(' || currentCharacter == ']' && topOfStack == '[')
                   stack.pop();
               //if not matched then it is not balanced
               else
                   return false;
           }
       }
       //at the end of the string stack shoudl be empty
       if(stack.isEmpty())
           return true;
       return false;
   }
}