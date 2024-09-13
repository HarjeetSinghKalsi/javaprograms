package basic;

public class Overload_NonStatic_Main_Method 
{
	
	public void main (String name)
	{
	 System.out.println("1");	
	}
	
	
	public void main(int age)
	{
	  System.out.println("2");	
	}
	
	
	public void main (double salary)
	{
		System.out.println("3");
	}
	
	
	public void main(boolean is_emp)
	{
		System.out.println("4");
	}
	

	public static void main(String[] args)     // heart
	{
		
		Overload_NonStatic_Main_Method n1=new Overload_NonStatic_Main_Method();
		n1.main("harjeet");
		n1.main(33);
		n1.main(50000.2344);
		n1.main(true);
				


	}

}
