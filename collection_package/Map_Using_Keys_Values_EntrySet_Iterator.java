package collection_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Using_Keys_Values_EntrySet_Iterator {

	public static void main(String[] args) {
		
		
		 Map <Integer, String> m1           =  new   HashMap <Integer, String>();
		 m1.put(234565, "harjeet");
		 m1.put(879465, "raj");
		 m1.put(980654, "vivek");
		 m1.put(324365, "rekha");
		 
		//it is another way to fetch data of keys and values
		Set<Entry<Integer, String>> p1 =           m1.entrySet();
		 Iterator<Entry<Integer, String>> p2 =   p1.iterator();
		 
		 while(p2.hasNext())
		 {
			System.out.println(p2.next()); 
		 }
		 
		
		 
		//it is used to fetch data of keys and values
		 for(Entry<Integer, String> e1 :   m1.entrySet())
		 {
			 System.out.println(e1);
		 }
		 
		 //fetching values of data
		   for ( String s1 :        m1.values())
		   {
			 System.out.println(s1);  
		   }
		   
		   //fetching values of keys
		    for(Integer i1:           m1.keySet())
		    {
		    	System.out.println(i1);
		    }
		 

	}

}
