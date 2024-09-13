package basic;

public class Constructor_Overloading
{
	Constructor_Overloading()
	{
		System.out.println("1");
	}
	
	Constructor_Overloading(int a, int b) //parameterized constructor
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	Constructor_Overloading(String name)
	{
		System.out.println("3");
	}
     
	Constructor_Overloading(boolean m)
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		new Constructor_Overloading();
		Constructor_Overloading obj = new Constructor_Overloading(7,7);
		new Constructor_Overloading("harjeet");
		new Constructor_Overloading(true);
		
	}

}
