package basic;
class Second //second class
{
	 static void car()
	 {
		 
	 }
	 
	 static void house()
	 {
		 System.out.println("house");
	 }
	 
}

public class Inheritance_Explain_First  extends Second //child class
{
	static void laptop()
	{
		
	}
	
	static void bike()
	{
		
	}
	
	static void key()
	{
		
	}
	
public static void main(String[] args) 
{
	
	laptop();
	bike();
	key();
	Second.car(); // another way of calling static method from parent class ClassName=methodname(); 
	house();
	
	
}

}
