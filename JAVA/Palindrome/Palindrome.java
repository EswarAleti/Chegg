import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//arr[] is array of string which stores the input strings
		String arr[] = new String[4];
		//Taking user input, here i assume number of inputs 
		for(int i=0;i<4;i++)
			arr[i] = sc.next();
		//Call check() function on each input string
		for(int i=0;i<4;i++)
			check(arr[i]);			
	}
	public static void check(String str)
	{
		//isPalindrome will be true if input string is palindrone, false otherwise
		//isMirror will be true if input string is mirror string, false otherwise
		boolean isPalindrome=true,isMirror=true;
		//Parse the string upto middle
		for(int i=0;i<str.length()/2;i++)
		{
			//left is character from left of the string which is at ith index
			//right is character from right of the string which is ar (length-i-1)th index
			char left=str.charAt(i), right=str.charAt(str.length()-i-1);
			//if left!=right that means it is not palindrome so make isPalindrome as false
			if(left!=right)
				isPalindrome=false;
		}
		//Parse the string upto middle
		for(int i=0;i<str.length()/2;i++)
		{
			//left is character from left of the string which is at ith index
			//right is character from right of the string which is ar (length-i-1)th index
			char left=str.charAt(i), right=str.charAt(str.length()-i-1);
			//if left is O or 0 then skip the character because both are valid
			if(left=='O' || left=='0')
				continue;
			//get reverse character of the left character of the string
			char reverse=getReverse(left);
			//reverse='-' means left doesn't has reverse character so string is not mirror string
			if(reverse=='-')
				isMirror=false;
			//reverse and right characters should be same otherwise string is not mirror string
			else if(reverse != right)
				isMirror=false;
		}

		//If a string is both palindrome and mirror string then it is mirrored palindrome
		if(isPalindrome==true && isMirror==true)
			System.out.println(str+" -- is a mirrored palindrome");
		else if(isPalindrome==true)
			System.out.println(str+" -- is a regular palindrome");
		else if(isMirror==true)
			System.out.println(str+" -- is a mirrored string");
		else
			System.out.println(str+" -- is not a palindrome");	
	}
	//This function return the reverse character of the input character
	//returns character '-' if the input character doen't has reverse character
	public static char getReverse(char ch)
	{
		char[] character = {'A','E','H','I','J','L','M','S','T','U','V','W','X','Y','Z','1','2','3','5','8'};
		char[] reverse = {'A','3','H','I','L','J','M','2','T','U','V','W','X','Y','5','1','S','E','Z','8'};
		for(int i=0;i<character.length;i++)
		{
			//If input character found in character array then return it's reverse character
			if(character[i] == ch)
				return reverse[i];
		}
		//return - if input character not found in character array
		return '-';	
	}	
}