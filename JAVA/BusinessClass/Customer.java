public class Customer extends Person
{
	private String firstName;
	private String lastName;
	private String lastPurchase;
	//Constructor
	public Customer(String firstName, String lastName,String lastPurchase)
	{
		//calling super class costructor
		super(firstName,lastName,"Customer");
		this.lastPurchase=lastPurchase;
	}
	//getLatestAction() method
	public String getLatestAction()
	{
		//if lastPurcahse is null then return No Purchases
		if(lastPurchase==null)
			return "No Purchases";
		return "Last Purchase: "+this.lastPurchase;
	}
}