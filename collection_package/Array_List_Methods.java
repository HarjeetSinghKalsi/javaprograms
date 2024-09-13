package collection_package;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Methods {

	public static void main(String[] args) {
		 
		 List li	     = new ArrayList();
		 li.add(67);
		 li.add(485);
		 li.add(598);
		 li.add(21); 
		 li.add("harjeet");
		 
		System.out.println(li);
		System.out.println(li.get( + 2)); //Get get the value on index 2
		System.out.println(li.set( 3 , 67)); //Set replace old value to new value on index 3
		System.out.println("index of -> " +li.indexOf("harjeet")); //Give the index

	}

}
