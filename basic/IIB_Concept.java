package basic;

public class IIB_Concept {
	 
	   //IIB
	{
		System.out.println("IIB");
	}
	
	static  //SIB
	{
		System.out.println("SIB");
	}
	

	public static void main(String[] args) 
	{
		
		System.out.println("Main Method");
		new IIB_Concept(); //creating an object of IIB, and it always create inside main method
	}
		
		public IIB_Concept() //Constructor created
		
		{
			System.out.println("Constructor");
		}
		
		
	}


