package basic;

class Grand_Parent
{
	Grand_Parent(int a, int b)   //parameterized constructor 
	{
		System.out.println("1");
	}
}

class Parent_Class extends Grand_Parent
{

	Parent_Class() //non parameterized constructor so no need to give parameter to Parent_Class super calling statement
	{
		super(0, 0);  //Since Grand_Parent class is parameterized so super calling statement should also parameterized. 
		System.out.println("2");
	}
}

public class SuperCalling_Using_Constructor extends Parent_Class
{
	 
	SuperCalling_Using_Constructor()
	{
		super();
		System.out.println("3");
	}
	
	
public static void main(String[] args)
{
	new SuperCalling_Using_Constructor();
}

}
