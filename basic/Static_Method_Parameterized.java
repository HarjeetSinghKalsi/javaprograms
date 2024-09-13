package basic;

public class Static_Method_Parameterized 
{
	
	static void add(int a, int b) 
	{
		int sum=a+b;
		System.out.println(sum);
		
	}

	
	static void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	
	static void login(String un, String pwd) 
	
	{
		
		System.out.println("login to GTM");
	}
	
	
	static void fb(String Fname, String Lname, String number, String DOB, char gender) 
	{
		System.out.println("fb");
	}


	public static void main(String[] args) {
		
		add(1,1);
	    sub(10,5);
	    login("hkalsi@gmail.com", "abcd@123");
	    fb("harjeet","kalsi","12345678l","07/08/1993",'M');

	}

}
