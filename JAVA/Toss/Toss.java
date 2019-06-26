//import Scanner for taking user input
import java.util.Scanner;
class Toss
{
	public static void main(String[] args) 
	{
		//creating object for Scanner class
		Scanner sc=new Scanner(System.in);
		//tossString is the input entered by user
		String tossString;
		//iterate until user enters q
		while(true)
		{
			//Taking user input
			System.out.print("Enter tosses:");
			tossString=sc.next();
			//If user enters q then break the loop
			//tossString.charAt(i) gives the Character At ith index of tossString 
			if(tossString.charAt(0)=='q')
				break;
			//Initially we start from state 1
			int state=1;
			//iterate entire string
			for(int i=0;i<tossString.length()-1;i++)
			{
				//toss will store the h and t
				char toss=tossString.charAt(i);
				switch(state)
				{
					//From diagram
					//From State1 if we get head goto state 5
					//From State1 if we get tail goto state 4
					//Do same for every state
					case 1:
						if(toss=='h')
							state=5;
						else
							state=4;
						break;
					case 2:
						if(toss=='h')
							state=1;
						else
							state=4;
						break;
					case 3:
						if(toss=='h')
							state=6;
						else
							state=2;
						break;
					case 4:
						if(toss=='h')
							state=7;
						else
							state=5;
						break;
					case 5:
						if(toss=='h')
							state=6;
						else
							state=3;
						break;
					case 6:
						if(toss=='h')
							state=8;
						else
							state=2;
						break;
					case 7:
						if(toss=='h')
							state=5;
						else
							state=8;
						break;
					case 8:
						if(toss=='h')
							state=9;
						else
							state=5;
						break;
					case 9:
						if(toss=='h')
							state=5;
						else
							state=6;
						break;
				}	
			}
			//Print the output for every toss
			System.out.println("The marker ends on circle "+state);
		}
	}
}