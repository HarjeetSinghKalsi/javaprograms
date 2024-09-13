package string_functions;

public class String_Functions2 {

	public static void main(String[] args) {
		
		String name = "Dev";
		String name1 ="Dev";   //string should be same then give only true
		boolean s1 =       name.equals(name1);  //used to compare the string with case sensitive
		System.out.println(s1);
		
		String name2 = "Harjeet";
		String name3 = "harjeet";
		boolean s2 =       name2.equalsIgnoreCase(name3); //used to compare the string without case sensitive
		System.out.println(s2);
		
		
	    String name4 = "jhony";
	    String name5 = " bravo"; //space before string
		String s3 =       name4.concat(name5); //first way to concatinate two strings 
		System.out.println(s3);
		
		String name6 = "jhonny";
		String name7 = "deep";
	    String s4 =       name6.concat(" ").concat("bravo"); //second way to concatinate two strings 
		System.out.println(s4);
		
	    String t1 ="leadership";
	    String name8 = t1.replace('p', 'z'); //replace the old char to new char
	    System.out.println(name8);
	    
	    String t2 ="devops learning";
	    String name9 = t2.replaceAll("learning", "expert"); //replace old string to new string
	    System.out.println(name9);
		
		
		
		

	}

}
