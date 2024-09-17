package collections;

public class String_Buffer_Class {
	
	//methods in StringBuffer

	public static void main(String[] args) {

    StringBuffer s1 =new StringBuffer ("automation");
    
	System.out.println("substring with single para is -> " + s1.substring(2)); //remove the string till the index position
	
	System.out.println("substring with 2 para is -> " + s1.substring(1, 5));  //extract string from 1 to 5
	
	System.out.println("length is -> " + s1.length());    // to get the count of string
	
	System.out.println("append is -> " + s1.append(" testing"));  //to add the string with existing string
	
	System.out.println("insert string -> " + s1.insert(11, "engineer  ")); //to insert the string at the given index
	
	System.out.println("replace string -> " + s1.replace(11, 21, "Api  ")); //replace the string from specified start index and end index
	
	System.out.println("delete string -> " + s1.delete(11, 14)); //delete the string from specified start index and end index
	
	System.out.println("reverse string -> " + s1.reverse()); // reverse the string
		 
		
	}

}
