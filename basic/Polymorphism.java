 package basic;

 //Run time polymorphism
 //Compile time polymorphism program can be use by methodoverloading
 

 class Myntra
 
 {
	 void login() //same name i.e. void and same signature i.e. login()
	 {
		System.out.println("login with mobile no");  // different implementation
	 }
	 
 }

public class Polymorphism extends Myntra // both class have relation
{

	void login() //same name i.e. void and same signature i.e. login()
	{
		
		System.out.println("login with email"); // different implementation
		
	}
	
	public static void main(String[] args) 
	{
		
		Flipkart f1 = new Flipkart(); //creating parent class object
		f1.login();

		Polymorphism a1 = new Polymorphism(); //created child class object
		a1.login();
 
	}

}
