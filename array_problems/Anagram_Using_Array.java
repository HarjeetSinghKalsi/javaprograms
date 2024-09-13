package array_problems;

import java.util.Arrays;

public class Anagram_Using_Array {
	
	//find out if given 2 arrays are anagram or not 
	
	public static void main(String[] args) {
		
		String n1="raw";                             //anagram words
		String n2="war";                             //anagram words
		char [] c1=          n1.toCharArray();       //convert String to array - step 1
		char [] c2=          n2.toCharArray();       //convert String to array - step 1
		
		                     Arrays.sort(c1);        //sort array step - 2
		                     Arrays.sort(c2);         //sort array step - 2
		System.out.println(Arrays.toString(c1));      //Print array in sort manner step - 5
		System.out.println(Arrays.toString(c2));      //Print array in sort manner step - 5
		
		 
		boolean b1=   Arrays.equals(c1, c2);          //check if string 1 == string 2 step - 3 
		 System.out.println(b1);                      //check if string 1 == string 2 step - 3 
		 
		 if(b1==true)                                 //checking condition step -4 
		 {
			 System.out.println("This is Anagram");
		 }
		 else
		 {
			 System.out.println("This is not Anagram");
		 }
		
	}

}
