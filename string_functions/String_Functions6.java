package string_functions;

import java.util.Arrays;

public class String_Functions6 {
	
	//repeat, split, split all

	public static void main(String[] args) {
		
		String name="harjeet";
		   String a=         name.repeat(12);   //repeat String function
		   System.out.println(a);
		   
		   String name1="I have a boy";
		   String []s1   =    name1.split(" ");  //split String function
		   System.out.println(Arrays.toString(s1));
		   
		   
		   String name2="I have a boy";
		   String []s2   =    name2.split(" " ,2);  //split with parameter String function
		   System.out.println(Arrays.toString(s2));
		   

	}

}
