package p2;

//what happens outside the package by becoming sub class using access specifier

//what happens outside the package without creating relationship sub class using access specifier just comment extends

import p1.Parent_Class;

public class Child_Class extends Parent_Class
{
 
	public static void main(String[] args) 
	{
		Parent_Class.add();
		Child_Class n1 = new Child_Class(); //calling non static method from parent class
		n1.sub();
		
				

	}

}
