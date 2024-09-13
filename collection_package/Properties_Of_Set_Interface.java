package collection_package;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Properties_Of_Set_Interface {

	public static void main(String[] args) {
		
		Set s1         =  new HashSet();
		s1.add(345);
		s1.add(544);
		s1.add(23);
		s1.add(23);
		s1.add("harjeet");
		s1.add(null);
		s1.add("mini");
		System.out.println(s1);
		
		 Iterator i1=            s1.iterator();
		 while (i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }

	}

}
