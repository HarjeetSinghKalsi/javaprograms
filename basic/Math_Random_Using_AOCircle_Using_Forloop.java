package basic;

//Assignment 23Find out Area of 10 Circles where for every circle radius come from math.random

public class Math_Random_Using_AOCircle_Using_Forloop 
{
	 static double pi =Math.PI; //using final keyword in variable
	 static void area()
	 {
		for (int i=0; i<10; i++)
		 {
			
			double r =Math.random();
			System.out.println("value of radius is - " + r);
			
			double area=pi*r*r;
			System.out.println("Area of circle - " +area);
			
		 }
	 }
	 
  	public static void main(String[] args) 
  	{
  		area();
  	}	
}
