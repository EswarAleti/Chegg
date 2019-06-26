import java.util.Scanner;
class TelephoneDigits
{
	public static void main(String[] args) 
	{
		//creating object for scanner class or taking input from user
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Y/y to convert a telephone number from letters to digits.");
			System.out.println("Enter any other letter to terminate the program.");
			//user choice
			char ch=sc.next().charAt(0);
			if(ch!='y' && ch!='Y')
				break;
			System.out.println("Enter a telephone number in letters:");
			//user input for telephone in letters
			//telLet means telephone in letters
			String telLet = sc.next();
			//telNum means telephone in numbers
			String telNum = "";
			//we should iterate for 7 letters
			for(int i=0;i<7;i++)
			{
				//taking each character as integer
				int a =  telLet.charAt(i);
				//if we are at 3rd digit we should pad - to the nunber
				//we should each 3 characters as a group and should give a number to that group
				//Like A,B,C as a group with no 2, D,E,F as a group with no 3.... etc
				//(a-65) becasue character to a proper integer for better enumeration
				if(i==2)
					telNum = telNum + ((a-65)/3 + 2) + "-";
				else
					telNum = telNum + ((a-65)/3 + 2);
			}
			//printing output
			System.out.println("The corresponding telephone number is:");
			System.out.println(telNum);
		}
	}	
}