package array_problems;

public class Array_Prblm1 {

	public static void main(String[] args) {
		
		int rollno[]=new int[4];
		rollno[0]=42;
		rollno[1]=33;
		rollno[2]=78;
		rollno[3]=10;
		
		String name[]= new String[4];
		name[0]="harjeet";
	    name[1]="mini";
		name[2]="akash";
		name[3]="amit";
				
		
		for(int i=0; i<4; i++) 
		{
		  System.out.println("Name is ->  "+name[i] + " and rollno is -> "+ rollno[i]);
		}
		
		

	}

}
