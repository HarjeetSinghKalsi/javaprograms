	package basic;
	
	//SIB will execute first then main method will execute
		//we can have multiple SIB in a program
		

public class SIB_Concept {
	
	static  //SIB 
	{
		System.out.println("SIB 1");
	}
	
	static 
	{
		System.out.println("SIB 2");
	}
	
	static 
	{
		System.out.println("SIB 3");
	}
	
	static 
	{
		System.out.println("SIB 4");
	}

	public static void main(String[] args) 
	{
       System.out.println("Main method ");
	}

}
