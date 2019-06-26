public class Foo 
{
	protected double x;
	protected int y;
	protected String z;
	public Foo() 
	{
		this("Midterm");
	}
	public Foo(String x) 
	{
		this(x, x.length());
	}
	public Foo(String x, int y) 
	{
		this.x = y * 0.5;
		this.y = y;
		this.z = x;
	}
	public void print(String x) 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public void print(double z)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}