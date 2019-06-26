//util package is for stack
import java.util.*;
//io package for FileReader and BufferedReader
import java.io.*;
class MatchingParanthesis
{
	public static void main(String[] args)throws IOException 
	{
		//Creating object fr for FileReader cass, input text file is input.txt
		FileReader fr=new FileReader("input.txt");
		//Creating object for br for BufferedReader
		BufferedReader br=new BufferedReader(fr);
		//String str holds a line text file for each iteration of while
		String str="";
		//run while until file reaches the end
		while((str=br.readLine())!=null)
		{
			//method calling
			isCountBalanced(str);
		}
	}
	//This method checks that there are equal left and right paranthesis or not
	public static void isCountBalanced(String str)
	{	
		//left denotes number of left paranthesis
		//right denotes number of right paranthesis
		int left=0,right=0;
		//parse the string
		for(int i=0;i<str.length();i++)
		{
			//If character at ith index is ( then increment left
			if(str.charAt(i)=='(')
				left++;
			//If character at ith index is ) then increment right
			else if(str.charAt(i)==')')
				right++;
		}
		if(left>right)
			System.out.println(str+" -> There are extra left paranthesis");
		else if(left<right)
			System.out.println(str+" -> There are extra right paranthesis");
		//If left=right then call isBalanced method
		else
			isBalanced(str);
	}
	public static void isBalanced(String str)
	{
		//Creating Character stack
		Stack<Character> stack = new Stack<>();
		//Parse the string
		for(int i=0;i<str.length();i++)
		{
			//ch is a character that holds character of str at ith index
			char ch=str.charAt(i);
			//if character is ( then push onto the stack
			if(ch=='(')
				stack.push('(');
			//If character is ) and stack is empty then it is not balanced prompt it and return
			else if(ch==')' && stack.empty())
			{
				System.out.println(str+" -> Not balanced");
				return;
			}
		}
		//we come here only when the string is balanced
		System.out.println(str+" -> Balanced");
	}
}