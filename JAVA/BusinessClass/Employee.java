public class Employee extends Person
{
	private String firstName;
	private String lastName;
	private String lastSale;
	//Constructor
	public Employee(String firstName, String lastName,String lastSale)
	{
		//calling super class costructor
		super(firstName,lastName,"Employee");
		this.lastSale=lastSale;
	}
	//getLatestAction() method
	public String getLatestAction()
	{
		//if lastSale is null then return No Sale		
		if(lastSale==null)
			return "No sale";
		return "Last sale: "+this.lastSale;
	}
}