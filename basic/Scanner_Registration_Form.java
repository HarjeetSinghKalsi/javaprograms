package basic;

import java.util.Scanner;

//Assignment 19 https://grotechminds.com/registration/ FirestName, 
//LastName,Email,Password,Make,Female,Present address,Permanent Address,Pincode

public class Scanner_Registration_Form {

	public static void main(String[] args) {
            
		      Scanner s1 = new Scanner (System.in);	
		      
		   System.out.println("Enter First Name");   
            String first_name=        s1.next();  
            
            System.out.println("Enter Last Name");
            String last_name=         s1.next();
            
            System.out.println("Enter Email ");
            String Email=             s1.next();
            
            System.out.println("Enter Password");
            String Password=		  s1.next();
            
            System.out.println("Enter Gender");
            String Gender=            s1.next();
            
            System.out.println("Enter Present Address");
            String Present_Address=   s1.next();
            
            System.out.println("Enter Permanent Address");
            String Permanent_Address= s1.next();
            
            System.out.println("Enter Pincode");
            int Pincode=              s1.nextInt();
            
            
            
                      
                      
		
		
		
		
		
		
	

	}

}
