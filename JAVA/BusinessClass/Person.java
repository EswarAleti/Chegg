public abstract class Person
{
	private String firstName;
	private String lastName;
	private String typeName;
	//Constructor
	public Person(String firstName, String lastName, String typeName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.typeName=typeName;
	}
	//Getters
	public String getTypeName()
	{
		return this.typeName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	//setters
	public void setTypeName(String typeName)
	{
		this.typeName=typeName;
	}
	public String setFirstName(String newFirstName)
	{
		//if newFirstName is null then don't change firstName
		if(newFirstName==null)
			return this.firstName;
		this.firstName=newFirstName;
		return firstName;
	}
	public String setLastName(String newLastName)
	{
		//if newLastName is null then don't change lastName
		if(newLastName==null)
			return this.lastName;
		this.lastName=newLastName;
		return lastName;
	}
	//indexOf() method implementation
	public static int indexOf(Person[] people, String firstName, String lastName, String typeName)
	{
		//if all arguments are null just return -1
		if(firstName==null && lastName==null && typeName==null)
			return -1;
		//Iterate over array
		for(int i=0;i<people.length;i++)
		{
			//try catch for avoiding nullPointerException
	        try
	        {
	        	//If data matched then return index
	            if((firstName==null || firstName.equals(people[i].firstName)) && (lastName==null || lastName.equals(people[i].lastName)) && (typeName==null || typeName.equals(people[i].typeName)))
				{
					return i;
				}
	        }
	        catch(Exception e){}
		}
		//We came here if data not matched
		return -1;
	}
}