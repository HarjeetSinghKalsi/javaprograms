package collection_package;

import java.util.ArrayList;
import java.util.List;

public class Properties_Of_List_Interface {
	
	//upcasting ArrayList to List

	public static void main(String[] args) {
		               
		List li=      new ArrayList(); //Converting child class object of the super class type is called upcasting.
		li.add(876);
		li.add("harjeet");
		li.add(true);
		li.add(90.67);
		li.add("story to tell");
		li.add(null);
		li.add(null);
		 
		System.out.println(li);
		
		
		
		

	}

}
