 package basic;

 class Google
 
 {
	 void login() //same name i.e. void and same signature i.e. login()
	 {
		System.out.println("login with mobile no");  // different implementation
	 }
	 
 }

public class Super_Keyword_Using_Method_Overriding extends Google // both class have relation
{

	void login() //same name i.e. void and same signature i.e. login()
	{
		super.login();  //keyword super.parentclass non static method name
		System.out.println("login with email"); // different implementation
		
	}
	
	public static void main(String[] args) 
	{
		Super_Keyword_Using_Method_Overriding a1 = new Super_Keyword_Using_Method_Overriding();
		a1.login();

	}

}
