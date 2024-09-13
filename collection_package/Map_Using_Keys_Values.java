package collection_package;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Using_Keys_Values {

	public static void main(String[] args) {
		
		 Map<String, String> m1    = new HashMap <String, String>();
		 m1.put("GTM11", "harjeet");
		 m1.put("GTM12", "sam");
		 m1.put("GTM13", "varun");
		 m1.put("GTM14", "deepak");
		 System.out.println(m1);
		 
		 for (  String s1 :     m1.keySet())  // fetching keys i.e. GTM11
		 {
			 System.out.println(s1);
		 }
		 
		 for ( String s2 :      m1.values()) //fetching values i.e. harjeet
		 {
			 System.out.println(s2);
		 }

		 for (  Entry<String, String> s3 :  m1.entrySet()) //to fetch the keys and values data together 
		 {
			 System.out.println(s3);
		 }
		 
	}

}
  