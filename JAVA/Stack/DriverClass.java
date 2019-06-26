import java.util.Scanner;
public class DriverClass
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       Stack stack = new Stack();
	   int data;
	   while(true)
	   {
			System.out.println("1.Push\n2.pop\n3.size\n4.exit\nEnter choice::");
			int choice = in.nextInt();
			switch(choice){
				case 1: System.out.println("Enter element:\t");
						data= in.nextInt();
						stack.push(data);
						break;
				case 2: System.out.println("Popped Element:\t"+ stack.pop());
						break;
				case 3: System.out.println("Size of Stack:\t"+stack.size());
						break;
				case 4: System.exit(1);
			}
	   }
      
   }
}


