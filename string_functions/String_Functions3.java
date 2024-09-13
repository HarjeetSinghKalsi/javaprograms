package string_functions;

public class String_Functions3 {

	public static void main(String[] args) {
	
   //remove all the alphabet used
		String name ="kv no 2 banglore";
		String s1=          name.replaceAll("[a-z]", " ");
	    System.out.println(s1);
		          
  //remove all the numeric used
		String singername="50 cent";
		String s2=      singername.replaceAll("[0-9]", " ");
		System.out.println(s2);
		        
   //remove all the capital letter from Manish Tiwari
		        
		String name2="Manish Tiwari"; 
		String s3=        name2.replaceAll("[A-Z]", " ");
		System.out.println(s3);
		
//remove all the space from "My name is harjeet"
		String name3="my name is harjeet";
		String s4=     name3.replaceAll(" ","");
		System.out.println(s4);
		           

		
	} 

}