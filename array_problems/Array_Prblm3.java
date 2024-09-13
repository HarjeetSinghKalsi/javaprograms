package array_problems;

import java.util.Arrays;

public class Array_Prblm3 {
	//use tocharArray to convert string into array
	//sort array
	
	public static void main(String[] args) {
		
		String name="harjeet";
         char [] c1=             name.toCharArray();  //converting string into array
              System.out.println(Arrays.toString(c1));
                 
              Arrays.sort(c1); //sorting array
              System.out.println(Arrays.toString(c1));

		
	}
	
	
}
