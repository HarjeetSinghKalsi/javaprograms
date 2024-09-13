package basic;

import java.util.Scanner;

public class SwitchCase {             

	public static void main(String[] args)
	{
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for firefox");
		System.out.println("Press 3 for edge");
		System.out.println("Press 4 for safari");
		System.out.println("Press 5 for IE");
		
		
		Scanner s1=new Scanner (System.in);
		  int a=       s1.nextInt(); //human input at the runtime
		  
		switch(a)
		{
		
		//if we will not use scanner class then it is execute like compile time
		case 1:
			//logic of switch
		    //ChromeDriver driver = new ChromeDriver();
			System.out.println("lauch chrome browser");
			break;
			
		case 2:
			System.out.println("lauch firefox browser");
			break;
			
		case 3:
			System.out.println("lauch edge browser");
			break;
			
		case 4:
			System.out.println("lauch safari browser");
			break;
			
			
		case 5:
			System.out.println("lauch IE browser");
			break;
		
	   default :
	         System.out.println("sorry selection is wrong, pls check again");
	         
	         
	         
	         
		}

	}

}
