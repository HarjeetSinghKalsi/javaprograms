package basic;

public class Global_Variable
{
	String name="Ramya"; //global variable
	static double ram_salary=90456.87; //global variable

	public static void main(String[] args)
	{
		int age =54; //local variable
		System.out.println(age);
	   System.out.println(ram_salary);
	   Global_Variable g1 = new Global_Variable();
	   System.out.println(g1.name);

      
	}

}
