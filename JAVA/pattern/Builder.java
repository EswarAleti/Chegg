public class Builder
{
	String name;
	public Builder(String name)
	{
		this.name=name;
	}	
	public String getName()
	{
		return name;
	}
	public String makeRow(int n,String s)
	{
		String row="";
		//add string for n times and return
		for(int i=1;i<=n;i++)
			row=row+s;
		return row;
	}
	public void printPyramid(int n, String s)
	{
		//spaceCount is to define how many spaces required in each line
		int spaceCount = n;
		//i defines the number of * at each line, incremented by 2
		for(int i=1;i<=n;i=i+2)
		{
			//call makeRow() t o print space
			System.out.print(makeRow(spaceCount," "));
			//call makeRow() t o print *
			System.out.println(makeRow(i,"*"));
			spaceCount-=1;
		}
	}
}