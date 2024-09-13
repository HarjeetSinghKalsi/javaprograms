package basic;

  class AMZ_Class
{
	final void auth() //using final keyword using method
	{
		System.out.println("login with email id");
	}
	
}

public class Final_Method_Using_Methodoverring extends AMZ_Class
{
	void mobileno()
	{
		System.out.println("login with mobile no");
	}

	public static void main(String[] args)
	{
		Final_Method_Using_Methodoverring n1 = new Final_Method_Using_Methodoverring();
		n1.auth();
		n1.mobileno();

	}

}
