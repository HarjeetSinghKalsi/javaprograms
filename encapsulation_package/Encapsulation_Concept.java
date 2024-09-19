package encapsulation_package;

class AmazonLogin
{
	private String un="dummy@gmail.com";   //restricting sesitive info making it as a private and giving indirect access using getter and setter method
	private String pwd="password";
	private int otp=0000; 
	
	
	public String getPwd() //getter method for pwd
	{
		return pwd;
	}

	public void setPwd(String pwd) //setter method for pwd
	{
		this.pwd = pwd; //updating local var value to global var 
	}

	public String getUn()  //getter method for un
	{
		return un;
	}
	
	public void setUn(String un) //setter method for un and if anytime you set something it will be parameterized
	{
		this.un=un;  //updating local var value to global var
	}
	
	public void setotp (int otp)
	{
		this.otp=otp;
	}
	
	public int getotp ()
	{
		return otp;
	}
	
}

public class Encapsulation_Concept {

	public static void main(String[] args)
	{
		
		AmazonLogin a1 = new AmazonLogin();
		a1.setUn("harjeet.kalsi007@gmail.com");
		System.out.println(a1.getUn());
		
		a1.setPwd("contact@123");
		System.out.println(a1.getPwd());
		
		a1.setotp(5467);
		System.out.println(a1.getotp());
		
			
	   
	}

}
