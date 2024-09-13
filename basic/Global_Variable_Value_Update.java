package basic;

public class Global_Variable_Value_Update 
{
	String name="Ramya"; //global variable
	static double ram_salary=90456.87; //global variable

	public static void main(String[] args)
	{
		ram_salary=1000000;            // varible and updated value
	   System.out.println(ram_salary); //calling static method
	   Global_Variable g1 = new Global_Variable();// calling non static method
	   g1.name="Ramya varma";         // varible and updated value
	   System.out.println(g1.name);

	}

}
