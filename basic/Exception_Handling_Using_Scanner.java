package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_Using_Scanner {

	public static void main(String[] args)
	{
		try
		{
			
		Scanner s1 =new Scanner(System.in);
		System.out.println("please enter your age");
		int age=        s1.nextInt(); 
		
		}
		
		catch(InputMismatchException a1)
		{
			
			System.out.println("sorry but this doesn't seems your age");
			Scanner s2 =new Scanner(System.in);
			System.out.println("please enter your age again");
			int age1=        s2.nextInt();

		}
		
		

	}

}
