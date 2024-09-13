package basic;

//using all access specifier using different class i.e Access_Specifier_P1

public class Access_Specifier_Within_Package 
{

	public static void main(String[] args) 
	{
		Access_Specifier_P1.m1();
	  //Access_Specifier_P1.m2();  //couldn't call private A.S. in different class
		Access_Specifier_P1.m3();
		Access_Specifier_P1.m4();

	}

}
