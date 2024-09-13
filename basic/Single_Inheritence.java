package basic;

	class Parent {
		
		static void house()
		{
			System.out.println("my first house");
		}
		
		 void car()
		{
			System.out.println("my first car");
		}
		
	}

	
	
	public class Single_Inheritence extends Parent
	{
		static void bike()
		{
			System.out.println("My first bike");
		}
		
		void laptop()
		{
			System.out.println("my first laptop");
		}
		
	
	public static void main(String[] args) 
	{
	    house(); //calling static method from parent class
		Parent n1=new Parent();
		n1.car(); //calling non static method from parent class
		bike();  //calling static method from sub class
		Single_Inheritence n2=new Single_Inheritence(); //calling non static method from sub class
		n2.laptop();
		
     		


	}

}
