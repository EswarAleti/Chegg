import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		//Array declaratiojn
		Person[] people=new Person[100];
		//index of array
		int index=0;

		//creating objects and insert into array
		Employee e1=new Employee("Daniel","Man","Sold 1,000 fireworks on July 4");
		people[index++]=e1;
		Customer c1=new Customer("Daniel","David","1x bottle of cereal, 2x cartons of milk");
		people[index++]=c1;
		
		//indexOf() testing calls
		System.out.println(Person.indexOf(people,"Daniel","David","Customer"));
		System.out.println(Person.indexOf(people,"Daniel",null,null));
		System.out.println(Person.indexOf(people,"Daniel",null,"Customer"));
		System.out.println(Person.indexOf(people,"Daniel",null,"Employee"));
		System.out.println(Person.indexOf(people,null,"Man",null));
		System.out.println(Person.indexOf(people,null,null,null));
	}
}