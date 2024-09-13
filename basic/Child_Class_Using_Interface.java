package basic;

interface Amazon
{
	void login_google();
	void login_fb();
}

public class Child_Class_Using_Interface implements Amazon
{

	public void login_google()
	{
		System.out.println("google");
	}

	public void login_fb()
	{
		System.out.println("fb");;
	}
	
	public static void main(String[] args)
	{
		Child_Class_Using_Interface n1 = new Child_Class_Using_Interface();
		n1.login_google();
		n1.login_fb();
	}

}
