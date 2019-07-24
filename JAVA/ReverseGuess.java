import java.util.Scanner;
public class ReverseGuess
{
	public static void main(String[] args) 
	{
		//object for scanner class
		Scanner scanner=new Scanner(System.in);
		int min=1,max=100,count=0;
		//Run until correct result guessed
		while(min<=max)
		{
			//Number of guesses made should be incremented
			count++;
			//get random number
			int val=(min+max)/2;
			//prompt user for hos opinion
			System.out.print("Isit"+val+"? (types,b,orc): ");
			String guessResult=scanner.nextLine();
			//If computer guessed correct result then break
			if(guessResult.charAt(0)=='c')
			{
				break;
			}
			//if val is bigger then set max to val-1
			if(guessResult.charAt(0)=='b')
			{
				max=val-1;
			}
			//If val is smaller then set min to val+1
			else
			{
				min=val+1;
			}
		}
		System.out.println("I got it after making just "+count+" guesses");			
	}
}