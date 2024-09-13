package basic;

//Using Math with Scanner class 

import java.util.Scanner;

public class Scanner_Using_Math {

	public static void main(String[] args) {
		
	    Scanner s1 =new Scanner (System.in);  //Scanner Class
	    
	  //********************************************** 
		System.out.println("Enter the value of a");
		int a=            s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b=                  s1.nextInt();
		System.out.println("Exact value of sum a and b =  " + Math.addExact(100, 100)); //Math.add

	  //**********************************************
		
		System.out.println("Enter the value of a");
		int a1=            s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b1=                  s1.nextInt();
		System.out.println("Exact value of sub a and b =  " + Math.subtractExact(50, 10)); //Math.sub
		
		//********************************************
		
		System.out.println("Enter the value of a");
		int a2=            s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b2=                  s1.nextInt();
		System.out.println("Exact value of mul a and b =  " + Math.multiplyExact(10, 10)); //Math.mul
		
		//********************************************
		
		System.out.println("Enter the value of a");
		double a3=            s1.nextDouble();
		
		System.out.println("Enter the value of b");
		double b3=                  s1.nextDouble();
		System.out.println("Exact value from min a and min b =  " + Math.min(10.255, 10)); //Math.min
		
		//********************************************
		
		System.out.println("Enter the value of a");
		float a4=            s1.nextFloat();
		
		System.out.println("Enter the value of b");
		float b4=                  s1.nextFloat();
		System.out.println("Exact value from max a and min b =  " + Math.max(5.50, 5.55)); //Math.max
		
		//*********************************************
		
			System.out.println("Enter the value of a");
			int a5=            s1.nextInt();
			
			System.out.println("Enter the value of b");
			int b5=                  s1.nextInt();
			System.out.println("Exact value of abs  =  " + Math.abs(-10000)); ////Math.abs
			
	   //**********************************************
			
			System.out.println("Enter the value of a");
			double a6=            s1.nextDouble();
			
			System.out.println("Enter the value of b");
			double b6=                  s1.nextDouble();
			System.out.println("Random value  =  " + Math.random()); ////Math.random


	}

}
