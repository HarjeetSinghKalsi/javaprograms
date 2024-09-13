package array_problems;

import java.util.Arrays;

public class Array_Prblm5 {
	
	//copy the values of one array into another using iteration 
	
	
	public static void main(String[] args) {
		
		int rollno1[]=new int[4];
		 rollno1[0]=34;
		 rollno1[1]=76;
		 rollno1[2]=21;
		 rollno1[3]=39;
		int rollno2[]=new int[4];
		
		
		for(int i=0; i<4; i++) 
		{
		rollno2[i]=rollno1[i];
		}
		
		System.out.println(Arrays.toString(rollno1));
		System.out.println(Arrays.toString(rollno2));
		 
		 
		 
		
		
	}

}
