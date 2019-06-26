public class problem3 
{
	public static boolean isPalindrome(String str) 
	{
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-1-i))
				return false;
		}
		return true;
	}
	public static void printIsPal(String str, boolean isP) 
	{
		if (isP) 
		{
			System.out.println(str +" is a palindrome");
		}
		else 
		{
			System.out.println(str +" is not a palindrome");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1 = "ABCDCBA";
		System.out.println("Testing problem 3");
		System.out.println("-------------------------------------------");
		printIsPal(str1, isPalindrome(str1));
		String str2 = "ABCCBA";
		printIsPal(str2, isPalindrome(str2));
		String str3 = "ABCA";
		printIsPal(str3, isPalindrome(str3));
		String str4 = "ABC";
		printIsPal(str4, isPalindrome(str4));
	}
}