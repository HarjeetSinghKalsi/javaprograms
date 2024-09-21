package array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Prblm4 {
	
	//Except the value of array at runtime of int data type and size is 4 using Arrays.toString();

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int rollno[]=new int[4];
		for(int i=0; i<4; i++)
		{
			rollno[i]=   s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
	}

}
