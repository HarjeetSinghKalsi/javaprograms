package collection_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Remove_All {

	public static void main(String[] args) {

		 List li	     = new ArrayList();
		 li.add(67);
		 li.add(485);
		 li.add(598);
		 li.add(21); 
		
		 
		 List l2	     = new ArrayList();
		 l2.add("vikram");
		 l2.add("daman");
		 l2.add("ajay") ;
		 l2.addAll(li);
		 System.out.println(l2);
		
		 //remove all the collections 
		 l2.removeAll(li);
		 System.out.println(l2);
		 Collections.sort(l2);
		 System.out.println(l2);
		
		
	}

}
