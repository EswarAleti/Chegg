public class Demo
{
	public static void main(String[] args) 
	{
		//function calling
		System.out.println(targetSum("computer science ",4,13,'e'));
	}
	public static int targetSum(String line, int first, int last, char target)
	{
		int count=0;
		//first should be less than or equal to last
		if(first<=last)
		{
			//iterate from first to last, assume that string index starting from 0
			for(int i=first-1;i<last;i++)
			{
				//if character of line at ith index is equal to target the increment count by 1
				if(line.charAt(i)==target)
					count++;
			}
		}
		//if not found then return -1
		if(count==0)
			return -1;
		//else return count
		return count;
	}
}