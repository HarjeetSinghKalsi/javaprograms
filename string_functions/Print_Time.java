package string_functions;

import java.util.Date;

public class Print_Time {

	public static void main(String[] args) {
		
		Date d1= new Date();  //Print current time in machinery format, epoch converter to convert machinery time to human
 		System.out.println(d1.getTime());
		
 		
		Date d2 = new Date(d1.getTime()); //Print current time in human understandable format
		System.out.println(d2);
	        
		
		 String current_Time=  d2.toString(); //convert year to String using toString method
	   //String year= current_Time.substring(current_Time.length()-4); // first way to print only year
         String year= current_Time.substring(24, 28);  //Second way to print only year  i.e 2024
		 System.out.println(year);
		 
		 
		 String month= current_Time.substring(4, 7); //convert month to String
		 System.out.println(month);
		 
		 
		 String date = current_Time.substring(8, 10); //convert date to String
		 System.out.println(date);
		 
		 
		 String date_format1= date.concat("-").concat(month).concat("-").concat(year); //print date with dd-mm-yyyy
		 System.out.println(date_format1);
		 
		 String date_format2= date.concat("/").concat(month).concat("/").concat(year); //print date with dd/mm/yyyy
		 System.out.println(date_format2);
		 
		 
		 Date f1= new Date();
		 Date d3 = new Date(f1.getTime() +(1000*60*60*24*3));  //print date and time in future
		 System.out.println(d3);
		 
		 
		 Date f2= new Date();
		 Date d4 = new Date(f2.getTime() -(1000*60*60*24*3));  //print date and time in past
		 System.out.println(d4);
		

	}

}
