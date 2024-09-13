package collection_package;

import java.util.HashMap;
import java.util.Map;

public class Map_Using_Contains {

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
		 
	  boolean b1=	 m1.containsKey("harjeet"); // contains keys
	  System.out.println(b1);
	  
	  boolean b2 =   m2.containsValue(289);  //contain values
	  System.out.println(b2);

	}

}
