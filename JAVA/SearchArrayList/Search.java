import java.util.*;
import java.io.*;
public class Search
{
	//Function definition of findNumber
	static String findNumber(List<Integer> arr, int k)
	{
		//Iterate uentire array
		for(int i=0;i<arr.size();i++)
		{
			//If element found the return YES
			if(arr.get(i)==k)
				return "YES";
		}
		//We come here in case element not found
		return "NO";
	}
	public static void main(String[] args)throws IOException 
	{
		//Creation of Integer list
		List<Integer> list= new ArrayList<>(10);
		//inserting elements into list
		list.add(0);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(19);
		list.add(23);
		list.add(21);
		//function calling and printing the result
		System.out.println(findNumber(list,0));
		System.out.println(findNumber(list,13));
		System.out.println(findNumber(list,19));
	}
}