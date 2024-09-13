package basic;

public class Finally_Keyword_Exception_Handling {

	public static void main(String[] args) {
		
		try {
		int a=1/0;
		System.out.println(a);
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println("handled the exception");
		}
		
		finally  //will always in case of exception handling either try block will execute or catch block however finally will always execute.
		{
			System.out.println("Welcome to GTM");
		}

	}

}
