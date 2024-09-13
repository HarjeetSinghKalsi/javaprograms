package basic;

import java.util.Scanner;

//"Assignment 11 to 18WAP for calculating area of a circle,rectangle,square,triangle,trapezium.also calculating circumference of circle,
//rectangle and square using Scanner Class (user inputs)"

public class Scanner_Assignment {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		    //area of circle
	      	System.out.println("Enter value of area of circle double");
	 	    double pii=      s1.nextDouble();
	        System.out.println("Enter value of area of circle r1");    
		    int r1=         s1.nextInt();
		    System.out.println("Enter value of area of circle r2");		    
		    int r2=         s1.nextInt();
		    double area=pii*r1*r2;
		    System.out.println("area of circle-> "+area);
		    
		    
		    //area of rectangle
	        System.out.println("Enter value of area of rectangle Length");    
		    int l=         s1.nextInt();
		    System.out.println("Enter value of area of rectangle Breath");		    
		    int b=         s1.nextInt();
		    int rectangle=l*b;
		    System.out.println("area of rectangle->"+rectangle);
		    
		    
		    //area of square
	        System.out.println("Enter value of area of square a1");    
		    int a1=         s1.nextInt();
		    System.out.println("Enter value of area of square a2");		    
		    int a2=         s1.nextInt();
		    int square=a1*a2;
		    System.out.println("Area of square->"+square);
		    
		    
		  //area of triangle
	        System.out.println("Enter value of area of triangle 0.5"); 
	        float f=       s1.nextFloat();
	        System.out.println("Enter value of area of triangle h1");	
		    int h1=         s1.nextInt();
		    System.out.println("Enter value of  area of triangleh1");		    
		    int h2=         s1.nextInt();
		    float triangle=f*h1*h2;
		    System.out.println("area of triangle->"+triangle);
		    
		    
		   // area of tripezium
		    System.out.println("Enter value area of tripezium  0.5");
	 	    float a=      s1.nextFloat();
		    System.out.println("Enter value of area of tripezium l1");
	 	    int l1=      s1.nextInt();
	 	    System.out.println("Enter value of area of tripezium l2");
	 	    int l2=      s1.nextInt();
		    System.out.println("Enter value of area of tripezium h");		    
		    int h=         s1.nextInt();
		    double tripezium=0.5*(l1+l2)*h;
		    System.out.println("area of tripezium->"+tripezium);
		    
		    
		  //circumference of circle
		    System.out.println("Enter value of circumference of circle two");
	 	    int y=      s1.nextInt();
	 	    System.out.println("Enter value of circumference of circle pi");
	 	    double pi=      s1.nextDouble();
		    System.out.println("Enter value of circumference of circle r");		    
		    int r=         s1.nextInt();
		    double circle=y*pi*r;
		    System.out.println("circumference of circle->"+circle);

		    
		  //circumference of rectangle
		    System.out.println("Enter value of circumference of rectangle two");    
		    int two =         s1.nextInt();
		    System.out.println("Enter value of circumference of rectangle Length");    
		    int L=         s1.nextInt();
		    System.out.println("Enter value of circumference of rectangle Breath");		    
		    int B=         s1.nextInt();
		    int cofr=2*(L+B);
		    System.out.println("circumference of rectangle->"+cofr);
		    
		    
		  //circumference of square
	        System.out.println("Enter value of circumference of square four");    
		    int four=         s1.nextInt();
		    System.out.println("Enter value of circumference of square A");		    
		    int A=         s1.nextInt();
		    int cos=4*A;
		    System.out.println("circumference of square->"+cos);
	}

}
