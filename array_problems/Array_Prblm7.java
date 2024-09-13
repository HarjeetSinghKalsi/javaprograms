package array_problems;

import java.util.Arrays;

public class Array_Prblm7 {
	
 //copy one array to another array in reverse order

	public static void main(String[] args) {
		
		int array1[]=new int[4];
		array1[0]=45;
		array1[1]=21;
		array1[2]=89;
		array1[3]=35;
		
		int array2[]=new int[4];
		
		for(int i=0, k=3; i<array1.length; i++, k--)
		{
			array2[k] = array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		

	}

}
