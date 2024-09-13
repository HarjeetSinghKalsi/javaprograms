package collection_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Using_List {

	public static void main(String[] args) {
		
		
	 List li	     = new ArrayList();
	 li.add(67);
	 li.add(485);
	 li.add(598);
	 li.add(21); 
	 li.add("harjeet");
	 System.out.println("before sorting ->" + li);
	 
	 //using remove we remove indexing and object
	 li.remove(1);
	 System.out.println("remove indexing 1 " + li);
	 li.remove("harjeet");
	 System.out.println("remove object harjeet " + li);
	 
	 
	//Sorting 
	 Collections.sort(li);
	 System.out.println("after sorting ->" + li);
	 
	 
	 
	 //add-> add will accept the single object .
	 //addall-> addall will accept the entire collection.
	 
	 List l2	     = new ArrayList();
	 l2.add("man");
	 l2.add("women");
	 l2.addAll(li);
	 System.out.println("added all the indexing -> " + l2);
	 System.out.println("get the indexing of l2 -> " + l2.get(3));  //get is used to get the indexing      
	
   //equals method
	 boolean b1 =       li.equals(l2);
	 System.out.println(b1);
	 
	 
	 

	}

}
