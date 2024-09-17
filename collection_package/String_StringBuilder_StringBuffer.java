package collections;

public class String_StringBuilder_StringBuffer {

	public static void main(String[] args) 
	{
		String a1 ="Harjeet";
	    a1.concat("singh");
		System.out.println(a1); //Immutable i.e. unchangable, cannot change its value.
		  
	    StringBuilder s1 = new StringBuilder("AKash");	 
	    s1.append(" Ahirwar");
	    System.out.println(s1); //Mutable i.e. changable, can change its value.
	    
	    
	    StringBuffer s2 = new StringBuffer ("Ajay");
	    s2.append("Rajput");
	    System.out.println(s2); //Mutable i.e. changable, can change its value.

	}

}
