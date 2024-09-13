package collection_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Using_Iterator {

	public static void main(String[] args) {
		
		 Map<String, String> m1    = new HashMap <String, String>();
		 m1.put("GTM11", "harjeet");
		 m1.put("GTM12", "sam");
		 m1.put("GTM13", "varun");
		 m1.put("GTM14", "deepak");
		// System.out.println(m1);
		 
		 
		 //it is another way to fetch data of keys and values
		 Set<Entry<String, String>>  p1 =     m1.entrySet();
		 
		 Iterator<Entry<String, String>>   i1=   p1.iterator();
		                             
		 while( i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }

	}

}
