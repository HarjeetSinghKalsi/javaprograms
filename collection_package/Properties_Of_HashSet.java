package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Properties_Of_HashSet {

	public static void main(String[] args)
	{
		//checking -> Indexing,Duplicates,Dynamic,hetrogenious,Sort,Null,Iteration,ListIteartor
		
	      HashSet h1	  = new HashSet();
	      
	      h1.add(856);
	      h1.add(90.78);
	      h1.add("harjeet");
	      h1.add("harjeet");
	      h1.add("mini");
	      h1.add(null);
	      h1.add(null);
 
	      //not dynamic in nature
	      h1.add(856);
	      h1.add("harjeet");
	      h1.add("harjeet");
	      h1.add("mini");
	      h1.add(null);
	      h1.add(null);
	      System.out.println(h1);
	      
	      Iterator i1 =     h1.iterator();
	      while(i1.hasNext())
	      {
	    	  System.out.println(i1.next());
	      }
	      
	 
	 

	}

}
