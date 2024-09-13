package basic;

//using all 4 access specifier within same class and method


public class Access_Specifier_Within_Method
{
	
	public static void m1()
	{
		System.out.println("m1");
	}
	
	private  static void m2()
	{
		System.out.println("m2");
	}
	
	 static void m3()
	{
		System.out.println("m3");
	}
	
	protected static void m4()
	{
		System.out.println("m4");
	}

	public static void main(String[] args) 
    {
		m1();
		m2();
		m3();
		m4();

	}

}
