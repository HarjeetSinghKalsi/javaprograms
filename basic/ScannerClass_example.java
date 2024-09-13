package basic;

import java.util.Scanner;

public class ScannerClass_example
{
  
	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		
            //return type   //non static methods
	         System.out.println("enter you name");
	         String name=    s1.next();
	         System.out.println("enter you age");
		     int age=        s1.nextInt();
		     short age1=     s1.nextShort();
		     byte age2=      s1.nextByte();
		     long salary=      s1.nextLong();
		     float weight=   s1.nextFloat();
		     double wgt=     s1.nextDouble();
		     boolean value=  s1.nextBoolean();
		          
		
	}

}
