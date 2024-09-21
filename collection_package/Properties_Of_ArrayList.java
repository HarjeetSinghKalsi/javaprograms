package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Properties_Of_ArrayList {
	//checking -> Indexing,Duplicates,Dynamic,hetrogenious,Sort,Null,Iteration,ListIteartor

	public static void main(String[] args) {
		
		ArrayList   a1       = new ArrayList();
		  a1.add(567);
		  a1.add("harjeet");
		  a1.add("harjeet");
		  a1.add(null);
		  a1.add(null);
		  a1.add("abhishake");
		  a1.add(true);
		  a1.add(90.45);
		  a1.add("story to tell");
		  System.out.println(a1);
		  
		Iterator i1 =          a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		  
		  

	}

}
