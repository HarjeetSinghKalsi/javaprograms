package collection_package;

import java.util.Enumeration;
import java.util.Stack;

public class Enumeration_In_Stack {

	public static void main(String[] args) {
		    
	      Stack s1	      = new Stack();
	      s1.add(34);
	      s1.add(678);
	      s1.add(123);
	      s1.add(65);
	      s1.add(43);
	      
	     Enumeration b1=            s1.elements(); // enumeration
	     while (b1.hasMoreElements())
	     {
	    	 System.out.println(b1.nextElement());
	     }

	}

}
