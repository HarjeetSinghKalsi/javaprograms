package array_problems;

public class Array_Assignment24 {

	public static void main(String[] args) {
		
		double marks[]=new double[4];
		marks[0]=42.345;
		marks[1]=33.7899;
		marks[2]=78.234353;
		marks[3]=10.09865;
		
		char words[]= new char[4];
		words[0]='M';
		words[1]='I';
		words[2]='N';
		words[3]='D';

		boolean student[]=new boolean[4];
		student[0]=true;
		student[1]=false;
		student[2]=true;
		student[3]=false;
				
		
		for(int i=0; i<4; i++) 
		{
		  System.out.println("marks is -> "+marks[i] + " and words ->  "  + words[i] +  "  student is " + student[i]);
		}
		

	}

}
