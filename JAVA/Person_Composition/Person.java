public class Person
{
	private String name;
	private Location currentLocation;
	private Transportation transportation;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLocation(Location currentLocation)
	{
		this.currentLocation=currentLocation;
	}
	public void setTransportation(Transportation transportation)
	{
		this.transportation=transportation;
	}
	public String getName()
	{
		return this.name;
	}
	public Location getLocation()
	{
		return this.currentLocation;
	}
	public Transportation getTransportation()
	{
		return this.transportation;
	}
}