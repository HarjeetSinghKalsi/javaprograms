 package basic;

 class Flipkart
 
 {
	 void login() //same name i.e. void and same signature i.e. login()
	 {
		System.out.println("login with mobile no");  // different implementation
	 }
	 
 }

public class Method_Overriding extends Flipkart // both class have relation
{

	void login() //same name i.e. void and same signature i.e. login()
	{
		
		System.out.println("login with email"); // different implementation
		
	}
	
	public static void main(String[] args) 
	{
		Method_Overriding a1 = new Method_Overriding();
		a1.login();

	}

}
