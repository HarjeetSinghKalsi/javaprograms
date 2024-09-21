package array_problems;

import java.util.Arrays;

public class Array_Assignment25 {
	
	//check if the 2 arrays are equal to each other using char

	public static void main(String[] args) {
		
		char student_id1[]=new char[5];
		student_id1[0]='g';
		student_id1[1]='o';
		student_id1[2]='h';
		student_id1[3]='q';
		student_id1[4]='m';
		
		char student_id2[]=new char[5];
		student_id2[0]='g';
		student_id2[1]='o';
		student_id2[2]='h';
		student_id2[3]='q';
		student_id2[4]='m';
		
		boolean b1= Arrays.equals(student_id1, student_id2);
		System.out.println("2 Char Arrays are equal to each other -> " + b1);

	}

}
