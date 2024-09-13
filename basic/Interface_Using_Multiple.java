package basic;

//multiple level inheritence using interface

interface A
{
	void add();
	void sub();	
}

interface B
{
	void mul();
	void div();
}


public class Interface_Using_Multiple implements A,B
{

	public static void main(String[] args) 
	{
		Interface_Using_Multiple n1 = new Interface_Using_Multiple();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();

	}

	
	public void mul() 
	{
		int a =10;
		int b = 20;
		int mul=a*b;
		System.out.println(mul);
	}

	public void div() 
	{
		int a =10;
		int b = 20;
		int div=a/b;
		System.out.println(div);

	}

	
	public void add() 
	{
		int a =10;
		int b = 20;
		int sum=a+b;
		System.out.println(sum);

	}

	public void sub()
	{
		int a =10;
		int b = 20;
		int sub=b-a;
		System.out.println(sub);

	}

}
