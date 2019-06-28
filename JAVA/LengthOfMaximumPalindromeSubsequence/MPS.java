public class MPS
{
	//return the length of the maximum subsequence of seq[], revSeq[]
	public static int LCS(char[] seq, char[] revSeq, int m, int n)
	{
		if(m==0 || n==0)
			return 0;
		if(seq[m-1]==revSeq[n-1])
			return 1+LCS(seq,revSeq,m-1,n-1);
		else
			return max(LCS(seq,revSeq,m-1,n),LCS(seq,revSeq,m,n-1));
	}

	//return the maximum among a,b
	public static int max(int a, int b)
	{
		return a>b?a:b;
	}

	//Reverse the string str and return the result
	public static String reverse(String str)
	{
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		return s;
	}

	//main method
	public static void main(String[] args) 
	{
		String s1="XRABCIEKCOXAR";
		String s2=reverse(s1);
		//Type casting Strings into Character arrays
		char[] seq=s1.toCharArray(); 
   		char[] revSeq=s2.toCharArray();
   		//Function calling and printing the result
   		System.out.println( LCS(seq, revSeq, s1.length(), s2.length()) ); 
	}
}