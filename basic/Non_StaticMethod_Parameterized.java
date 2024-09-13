package basic;

public class Non_StaticMethod_Parameterized 
{
	void add(int a, int b) 
	{
		int sum =a+b;
		System.out.println(sum);
	}
	
	void multiply (float a, float b)
	{
		float mul=(a*b);
		System.out.println(mul);
	}

	public static void main(String[] args)
	{
		Non_StaticMethod_Parameterized n1= new Non_StaticMethod_Parameterized();
		n1.add(10, 20);
		n1.multiply(3.123f, 2.45f);
		
     
	}
;
}
