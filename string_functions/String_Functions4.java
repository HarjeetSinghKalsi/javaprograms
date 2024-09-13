package string_functions;

public class String_Functions4 {

	public static void main(String[] args) 
	{
	
     //contains - return true if string contains the same string present with the given string 
		String name ="Harjeet kalsi";
		boolean a=  name.contains("kalsi");
		System.out.println(a);
		
	//matches - returns true if given string matches the last letter of string
		String name1="kevin";
		boolean a1=   name1.matches("(.*)n");
		System.out.println(a1);
		
	//matches - returns true if given string matches the first letter of string
		String name2="kevin";
		boolean a2=   name1.matches("k(.*)");
		System.out.println(a2);	
				
	//matches - return true if in given string check if 'j' is present or not
		String name3="Harjeet";
		boolean a3=       name3.matches("(.*)j(.*)");  // .* multi search character
				System.out.println(a3);
				
    //matches - return true if in given string have exact 4 letter present or not
	    String name4="Harjeet";
		boolean a4=       name4.matches(".......");
		System.out.println(a4);		
			
				
		
	}

	

}
