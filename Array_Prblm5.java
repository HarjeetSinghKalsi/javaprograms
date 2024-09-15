package array_problems;

public class Array_Prblm5 {
	
	//There is an array of size 5 of int data type and check if 34 is present on array or not
	//find out the index of 34
	
	public static void main(String[] args) {
		
		int rollno[]=new int[5];
		rollno[0]=56;
		rollno[1]=59;
		rollno[2]=32;
		rollno[3]=88;
		rollno[4]=34;
		int notocheck=34;
		
		for(int i=0; i<5; i++)
		{
			if(notocheck ==rollno[i])
			{
				System.out.println("The Given No -> " + notocheck + " is Present in array");
				System.out.println("The Given No -> " + notocheck + " and its index is -> " + i);
			}
		}
		
		
		
		
		
	}

}
