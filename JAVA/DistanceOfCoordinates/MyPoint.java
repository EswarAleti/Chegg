import java.lang.Math;
import java.text.DecimalFormat;
public class MyPoint
{
	private double x,y;
	private String name;
	static int numberOfCreatedPoints = 0;
	//No argument constructor for center
	MyPoint()
	{
		this.x=0;
		this.y=0;
		this.name="center";
	}
	//argument constructor numberOfCreatedPoints
	public MyPoint(double xCoor, double yCoor, String pointName)
	{
		this.x=xCoor;
		this.y=yCoor;
		this.name = pointName;
		//increment 
		numberOfCreatedPoints +=1;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public String getName()
	{
		return name;
	}
	public static int getNumberOfCreatedPoints()
	{
		return numberOfCreatedPoints;
	}
	public void showDetails()
	{
		System.out.println("x = "+getX());
		System.out.println("y = "+getY());
		System.out.println("Name = "+getName());
	}
	//String is return type because of DecimalFormat
	public String distance(MyPoint P1,MyPoint P2)
	{
		//DecimalFormat is to round distance upto 3 decimal points
		DecimalFormat df = new DecimalFormat("#.###");
		//Find distance using formula
		double distance = Math.sqrt(Math.pow(P1.getX()-P2.getX(),2) + Math.pow(P1.getY()-P2.getY(),2));
		//df.format() return String
		return df.format(distance);
	}
}