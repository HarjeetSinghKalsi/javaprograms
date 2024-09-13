package basic;

public class Constructor
{
	
	Constructor (String email)
	
	{
	  System.out.println(email);	
	}

	public static void main(String[] args)
	
	{
	   Constructor a1 = new Constructor("hkalsi@gmail.com");
	   Constructor a2 = new Constructor("hkalsi@gmail.com");
       new Constructor("hkalsi@gmail.com");
       new Constructor("hkalsi@gmail.com");
	}

}
