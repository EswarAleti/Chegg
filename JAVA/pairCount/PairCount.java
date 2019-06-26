import java.util.Scanner;
class PairCount
{
	public static void main(String[] args) 
	{
		int x=-1,y=-1,count=0;		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			x=sc.nextInt();
			if(x<0)
				break;
			if(x==y)
				count++;
			y=sc.nextInt();
			if(y<0)
				break;
			if(x==y)
				count++;
		}
		System.out.println(count);
	}	
}