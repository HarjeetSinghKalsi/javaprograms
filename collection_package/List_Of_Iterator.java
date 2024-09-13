package collection_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Of_Iterator {

	public static void main(String[] args) {
		
	  List li	      = new ArrayList();
	  li.add(456);
	  li.add(56);
	  li.add(887);
	  li.add(12);
	  
	    Iterator m1 =          li.iterator();
	    while(m1.hasNext())
	    {
	    	System.out.println(m1.next());
	    }
	    
	    System.out.println("List of Iterator");  // List of Iterator
	    
	         ListIterator m2=             li.listIterator();
	         
	         while(m2.hasNext())
	 	    {
	 	    	System.out.println("next iterator " + m2.next());
	 	    }
	         
	         while(m2.hasPrevious())
	 	    {
	 	    	System.out.println("previous iterator " + m2.previous());
	 	    }

	}

}
