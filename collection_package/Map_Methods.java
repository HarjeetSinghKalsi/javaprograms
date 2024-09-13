package collection_package;

import java.util.HashMap;
import java.util.Map;

public class Map_Methods {

	private static final String String = null;

	public static void main(String[] args) {

		 Map <String, Integer> m1        =  new HashMap <String, Integer>();
		 m1.put("harjeet", 89);
		 m1.put("rahul", 12); 
		 m1.put("john", 54);
		 m1.put("dev", 35);
		 System.out.println(m1);
		 
		 
		 
		 
		 Map <String, Integer> m2        =  new HashMap <String, Integer>();
		 m2.put("ajay", 289);
		 m2.put("vinod", 312);
		 m2.put("babu", 542);
		 m2.put("raju", 135);
		 System.out.println(m2);
		 
		 boolean b1 =    m1.equals(m2); //equals method
		 System.out.println(b1);
		 
		         m2.putAll(m1);
		         System.out.println(m2); //adding all the collection
		         
		         m2.clear();
		         System.out.println(m2);  //clear
		         
		    boolean b2 =     m2.isEmpty(); //empty
		         System.out.println(b2);
		         
		         
		         m2.putIfAbsent("deva", 786); // put if adding the data
		         System.out.println(m2);
		         
		         
		
	}

}
