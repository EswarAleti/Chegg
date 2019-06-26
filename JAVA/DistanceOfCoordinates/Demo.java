public class Demo
{
	public static void main(String[] args) 
	{
		//Creating objects
		MyPoint obj = new MyPoint();
		//Creating object for center
		MyPoint center = new MyPoint(0,0,"center");
		//Creating object for P1
		MyPoint P1 = new MyPoint(10,30.5,"P1");
		System.out.println("Number of created points: "+obj.getNumberOfCreatedPoints());
		System.out.println("-------------------------------------");
		System.out.println("First point details.");
		center.showDetails();
		System.out.println("-------------------------------------");
		System.out.println("Second point details.");
		P1.showDetails();
		System.out.println("-------------------------------------");
		//Calculate distance by calling distance with center,P1 objects as arguments
		System.out.println("The distance between the "+center.getName()+" and "+P1.getName()+" = "+obj.distance(center,P1));
	}
}