package basic;

public class Logical_Operator_And {

	public static void main(String[] args)
{
	int a=10;
	int b=20;
	if (a==b && b==10) //false
	{
		System.out.println("Block1");
	}
	if (a==10 && b==20)
	{
		System.out.println("Block2");
	}

}

}
