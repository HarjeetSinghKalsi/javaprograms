package array_problems;

import java.util.Arrays;

public class Array_Prblm6 {
	
	//tocharArray will convert the string into char
	//Sort char
	
	public static void main(String[] args) {
		
		String name="harjeet";
		char [] c1=      name.toCharArray(); 
		System.out.println(Arrays.toString(c1));
		
		      Arrays.sort(c1);	
		      System.out.println(Arrays.toString(c1)); //sort the array 
		
		
	}

}
