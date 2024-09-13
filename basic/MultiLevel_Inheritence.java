package basic;

//"Assignment 21 WAP for Multi-level Inheritance in a single class program.

//supermost class

class SuperMost{
	
    static void add()
     {
	   System.out.println("Print static method Super Most class");
      }
		
	void addition()
	{
		System.out.println("Print non static method Super Most class");
	}
}

//super class
class Super extends SuperMost{
	
    static void sub()
     {
	   System.out.println("Print static menthod Super class");
      }
		
	void subtraction()
	{
		System.out.println("Print non static method Super class");
	}
}

//child class
public class MultiLevel_Inheritence extends Super
{
	
	static void mul()
	{
		System.out.println("Print non method sub class");
	}
	
    void multiply()
	{
		System.out.println("Print non static method sub class");	
	}
	
	
	public static void main(String[] args) {
	
	
		mul();
		MultiLevel_Inheritence m1=new MultiLevel_Inheritence();
		m1.multiply();
		
		sub();
		m1.subtraction();
		
		add();
		m1.addition();

	
	}

}
