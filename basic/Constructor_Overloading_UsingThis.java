package basic;
public class Constructor_Overloading_UsingThis 
{
	
	Constructor_Overloading_UsingThis(String name)
	{
		System.out.println("constructor with name");

	}
	Constructor_Overloading_UsingThis(int a)
	{
		this("MKt");
		System.out.println("constructor with para");
	}
	
	Constructor_Overloading_UsingThis()
	{
		this(100);
		System.out.println("construcot with non para");
	}
	public static void main(String[] args) 
	{
	
		Constructor_Overloading_UsingThis g2=new Constructor_Overloading_UsingThis ();
	

	}

	

}
