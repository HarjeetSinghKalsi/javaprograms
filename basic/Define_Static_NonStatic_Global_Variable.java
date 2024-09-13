package basic;

public class Define_Static_NonStatic_Global_Variable
{
	 
	String name="Harjeet"; // non static global variable
	static boolean answer=false; // static global variable
	
	void subtract()
	{
		int a=100;
		System.out.println(a);
			
	}
	
	static void add() 
	{
		int b=200;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		int c=80;
		System.out.println(c);
		add();
		Define_Static_NonStatic_Global_Variable g1 = new Define_Static_NonStatic_Global_Variable();
		g1.subtract();
		System.out.println(answer); 
		Define_Static_NonStatic_Global_Variable g2 = new Define_Static_NonStatic_Global_Variable();
		System.out.println(g2.name);
		
		

	}

}
