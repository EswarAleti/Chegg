public class Widget
{
	private String s;
	private int i;
	private double d;
	public Widget(String s, int i, double d)
	{
		this.s=s;
		this.i=i;
		this.d=d;
	}
	public void setS(String s)
	{
		this.s=s;
	}
	public void setI(int i)
	{
		this.i=i;
	}
	public void setD(double d)
	{
		this.d=d;
	}
	public String getS()
	{
		return this.s;
	}
	public int getI()
	{
		return this.i;
	}
	public double getD()
	{
		return this.d;
	}
}