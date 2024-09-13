package basic;

public class Exception_Handling {

	public static void main(String[] args) 
	{
		try {
			
		int a=1/0;                  //exception in this line
		System.out.println(a);
		}
		catch(java.lang.ArithmeticException a1)
		{
			System.out.println("sorry but there was a blocker and we handle it");
		}

		
	}

}
