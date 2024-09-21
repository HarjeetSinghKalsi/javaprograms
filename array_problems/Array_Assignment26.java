package array_problems;

import java.util.Arrays;

public class Array_Assignment26 {
	
	//check if the 2 arrays are equal to each other using String

	public static void main(String[] args) {
		
		String student_id1[]=new String[5];
		student_id1[0]="rahul";
		student_id1[1]="aman";
		student_id1[2]="deepak";
		student_id1[3]="pankaj";
		student_id1[4]="geeta";
		
		String student_id2[]=new String[5];
		student_id2[0]="rahul";
		student_id2[1]="aman";
		student_id2[2]="deepak";
		student_id2[3]="pankaj";
		student_id2[4]="geeta";
		
		boolean b1= Arrays.equals(student_id1, student_id2);
		System.out.println("2 String Arrays are equal to each other -> " + b1);

	}

}
