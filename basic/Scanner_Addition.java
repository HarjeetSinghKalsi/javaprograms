package basic;

import java.util.Scanner;

public class Scanner_Addition {

	public static void main(String[] args) {
		
		        Scanner s1=new Scanner (System.in);
		        
		        
		        System.out.println("enter value of a");
                int a=        s1.nextInt();  
                
                System.out.println("enter value of b");
                int b=         s1.nextInt(); 
                
                int add= (a+b);
                System.out.println("Addition of two numbers->"+add);
	}

}
