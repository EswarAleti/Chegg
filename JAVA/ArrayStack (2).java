import java.util.Scanner;
@SuppressWarnings("unchecked")
class ArrayStack<AnyType> implements StackInterface<AnyType>
{
   private static final int DEFAULT_CAPACITY = 15;
   private int top;     // reference to the top element
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
    public static int evaluate(String tokens)
    {
        //char[] tokens = expression.toCharArray();
 
         // Stack for numbers: 'operands'
        ArrayStack<Integer> operands = new ArrayStack<Integer>(100);
 
        // Stack for Operators: 'operators'
        ArrayStack<Character> operators = new ArrayStack<Character>(100);
        
		for (int i = 0; i < tokens.length(); i++)
        {
			
             // if got whitespace
            if (tokens.charAt(i) == ' ')
                continue;
 
            // if got a number push onto stack
            if (tokens.charAt(i) >= '0' && tokens.charAt(i) <= '9')
            {
                String num="";
                // There may be more than one digits in number
                while (i < tokens.length() && tokens.charAt(i) >= '0' && tokens.charAt(i) <= '9')
				{
					num=num+tokens.charAt(i);
					i++;
				}
				i--;
                operands.push(Integer.parseInt(num));
            }
			
            // if got ( push onto operator stack
            else if (tokens.charAt(i) == '(')
                operators.push(tokens.charAt(i));
 
            // if got ) solve entire expression untill find (
            else if (tokens.charAt(i) == ')')
            {
                while (operators.peek() != '(')
                  operands.push(doOperation(operators.pop(), operands.pop(), operands.pop()));
                operators.pop();
            }
 
            // Current token is an operator.
            else if (tokens.charAt(i) == '+' || tokens.charAt(i) == '-' ||
                     tokens.charAt(i) == '*' || tokens.charAt(i) == '/')
            {
                // While top of 'operators' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'operators'
                // to top two elements in operands stack
                while (!operators.isEmpty() && hasPrecedence(tokens.charAt(i), operators.peek()))
                  operands.push(doOperation(operators.pop(), operands.pop(), operands.pop()));
 
                // Push current token to 'operators'.
                operators.push(tokens.charAt(i));
            }
			
        }
			
        //Expression is over then do remaining operation with respect to operators
        while (!operators.isEmpty())
            operands.push(doOperation(operators.pop(), operands.pop(), operands.pop()));
 
        // Top of 'operands' contains result, return it
        return operands.pop();
    }
 
    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' ) && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
 
    // A utility method to apply an operator 'op' on operands 'a' 
    // and 'b'. Return the result.
    public static int doOperation(char op, int b, int a)
    {
        switch (op)
        {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
        }
        return 0;
    }
 
    // Driver method to test above methods
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Expression to evaluate: ");
		String expression= sc.next();
        System.out.println(evaluate(expression));
    }
}
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
	