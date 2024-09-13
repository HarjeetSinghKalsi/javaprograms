package basic;

class Payroll //concrete class
{
	void payroll_salary() //non static concrete method
	{
		System.out.println("payroll");
	}
	
	static void payment() //static concrete method
	{
		System.out.println("payment");
	}
		
}

abstract class Facebook_Auth extends Payroll //abstract class
{
	abstract void fb_login(); //abstract method
	abstract void fb_registration();  //abstract method
	void api()  // concrete method under abstract class and are not require to be overridden 
	{
		System.out.println("Api");
	}
	
}
 
abstract class Google_Auth extends Facebook_Auth //abstract class
{
	abstract void google_login(); //abstract method
	abstract void google_registration(); //abstract method
}

public class Abstratc_Method_Multilevel extends Google_Auth
{

	void razor_pay() 
	{
	  System.out.println("pay from razorpay");	
	}
	
	void google_login() //overridden abstract method
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}

	
	void google_registration() //overridden abstract method
	{
		System.out.println("google registration");
	}

	
	void fb_login() //overridden abstract method
	{
		System.out.println("fb login");
	}

	
	void fb_registration() //overridden abstract method
	{
		System.out.println("fb registration");
	}
	
	public static void main(String[] args)
	{
		Abstratc_Method_Multilevel n1=new Abstratc_Method_Multilevel();
		n1.fb_login();
		n1.fb_registration();
		n1.google_login();
		n1.google_registration();
		n1.razor_pay();
		n1.payroll_salary();
		n1.api();
		payment();

	}

}
