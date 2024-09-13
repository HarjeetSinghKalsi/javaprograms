package string_functions;

public class String_Functions1
{

	public static void main(String[] args)
	{
	//*************************************************
		
		String name ="HArjeet";  //length of string
		
		int size=          name.length();
		System.out.println(size);
		     
	    System.out.println(name.toLowerCase());   //toLowerCase
	    System.out.println(name.toUpperCase());   //toUpperCase
	    
	   
	   //trim******************************************
	    
	    String s1="I am Harjeet";
	    System.out.println(s1);
	    System.out.println(s1.trim());
	                   
	                   
	    String s2="           I am Steve";   //trim left spaces
	    System.out.println(s2);           
	    System.out.println(s2.trim());
	    
	    String s3="         I am John             "; //trim start and end spaces
	    System.out.println(s3);
	    System.out.println(s3.trim());
	                   
	 //indexing***********************************************************
	    
		String s4 ="have a nice day!";     
		System.out.println(s4.substring(2));  // from index value given value till the last index will answer 
		
		String s5="good day harjeet";
		System.out.println(s5.substring(2, 11)); //starting from start index to end index-1 will answer
				 
		
	}

}
