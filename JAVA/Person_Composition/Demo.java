public class Demo
{
	public static void main(String[] args) 
	{
		Location location=new Location("USA");
		Transportation transportation=new Transportation("Car");
		Person person=new Person();
		person.setName("Remo");	
		person.setLocation(location);
		person.setTransportation(transportation);
		System.out.println("Name of the person: "+person.getName());
		System.out.println("Location of the person: "+person.getLocation().getPlace());
		System.out.println("Transportation used by the person: "+person.getTransportation().getVehicle());
	}
}