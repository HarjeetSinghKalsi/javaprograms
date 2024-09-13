package collection_package;

import java.util.ArrayList;
import java.util.List;

public class Clear_And_Empty {

	public static void main(String[] args) {

		 List li	     = new ArrayList();
		 li.add(67);
		 li.add(485);
		 li.add(598);
		 li.add(21); 
		 
		// li.clear(); //Clear
		// System.out.println(li);
		 
		boolean b1 = li.isEmpty();	 //Empty
		System.out.println(b1);
		
		boolean b2 =li.contains("rtr"); //contains
		System.out.println(b2);
		
		boolean b3 =li.contains(21); //contains
		System.out.println(b3);
		
		 }

}
