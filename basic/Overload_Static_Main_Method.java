 package basic;

public class Overload_Static_Main_Method
{
	
	public static void main(String a)
	{
		System.out.println("1");
	}
	
	public static void main(boolean t)
	{
		System.out.println("2");
	}
	
	public static void main (char m)
	{
		System.out.println("3");
	}
	
	public static void main (double f)
	{
		System.out.println("4");
	}
	public static void main(String[] args) //heart
	{
		main("harjeet");
		main(false);
		main('M');
		main(4.23455);	
	
	}

}
