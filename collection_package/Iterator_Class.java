package collection_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Class {

	public static void main(String[] args) {
		

		 List li	     = new ArrayList();
		 li.add(67);
		 li.add(485);
		 li.add(598);
		 li.add(21); 
		 
		 Iterator m1 =    li.iterator();
		 while (m1.hasNext())
		 {
			 System.out.println(m1.next());
			 
		 }

	}

}
