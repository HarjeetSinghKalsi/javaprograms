package basic;

public class Method_Overloading 
{
	
	void login (String emailid)
	
	{
         System.out.println(emailid);
	}
	
	 
	 void login (long mobile)
	
	{ 
        System.out.println(mobile);
	}
	
	
	public static void main(String[] args) 
	{
     	Method_Overloading n1=new Method_Overloading();
		n1.login("hkalsi@gmail.com");
		n1.login(7047001010L);
		
	
      
	}

}
