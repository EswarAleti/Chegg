import java.io.*;
import java.util.Scanner;
public class SeriesWinners
{
	public static void main(String[] args)throws IOException 
	{
		FileReader fr = new FileReader("World SeriesWinners.txt");
		BufferedReader br = new BufferedReader(fr);
		String[] arr=new String[107];
		String s="";
		int index=0;
		while((s=br.readLine())!=null)
		{
			if(index==0 || index==90)
			{
				arr[index]=s;
				index=index+2;
			}
			else
			{
				arr[index++]=s;
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter team name: ");
		String team=sc.nextLine();
		int count=0;
		for(int i=0;i<107;i++)
		{
			if(i!=1 && i!=91 && arr[i].equals(team))
			{
				System.out.println((i+1903));
				count++;
			}
		}
		System.out.println("Number of times won the series: "+count);
	}
}