//util package is for stack
import java.util.*;
//io package for FileReader and BufferedReader
import java.io.*;
class DecimalToBinary
{
	public static void main(String[] args)throws IOException
	{
		//Creating object fr for FileReader cass, input text file is H6Input2.txt
		FileReader fr=new FileReader("H6Input2.txt");
		//Creating object for br for BufferedReader
		BufferedReader br=new BufferedReader(fr);
		//String str holds a line text file for each iteration of while
		String str="";
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		//run while until file reaches the end
		while((str=br.readLine())!=null)
		{
			//StringTokenizer is used to tokenize the str into tokens using spaces
			StringTokenizer st=new StringTokenizer(str);
			while(st.hasMoreTokens())
			{
				//convert each string into integer
				int num = Integer.parseInt(st.nextToken());
				//push the num into stack1
				stack1.push(num);
			}
		}
		//Reversing the stack to follow the input order
		while(!stack1.empty())
		{
			//pop from stack 1 and push into stack2
			int num=stack1.pop();
			stack2.push(num);
		}
		while(!stack2.empty())
		{
			//pop the element from the stack2 and call method decimalToBinary()
			int num=stack2.pop();
			decimalToBinary(num);
		}
	}
	//this method converts decimal to binary equivalent
	public static void decimalToBinary(int num)
	{
		//binary stores the binary equivalaent of num
		String binary="";
		int flag=num;
		//run until flag becomes 0
		while(flag>0)
		{
			//find reminder on dividing 2
			int rem = flag%2;
			//add remainder to binary to the front
			binary = rem + binary;
			//reduce flag by dividing with 2
			flag = flag/2;
		}
		//print the result
		System.out.println(num+" -> "+binary);
	}	
}