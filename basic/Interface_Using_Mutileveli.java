package basic;

//multilevel inheritence using interface

interface Google1

{
	void login1();	
	void login2();
}

interface Google2 extends Google1

{
	void password1();
	void password2();
}


public class Interface_Using_Mutileveli implements Google2
{

	public static void main(String[] args)
	{
		Interface_Using_Mutileveli n1 = new Interface_Using_Mutileveli();
				n1.login1();
		        n1.login2();
		        n1.password1();
		        n1.password2();
	}
	
	public void login1()
	{
		System.out.println("login via email");
	}

	public void login2() 
	{
		System.out.println("login via mobile no");	
	}

	
	public void password1() 
	{
		System.out.println("enter alphabatic password ");
	}

	public void password2() 
	{
		System.out.println("enter numeric password ");
	}

}
