package basic;

public class This_Keyword_Using_Global_Var
{
     int studentid; //global variable
     String name;   //global variable
     double marks; //global variable
     
     void student_data(int studentid, String name, double marks) //parameterized non static method
     {
    	 this.studentid=studentid; //assign the local.v. to global.v.
    	 this.name=name;     //assign the local.v. to global.v.
    	 this.marks=marks;  //assign the local.v. to global.v.
     }
	public static void main(String[] args)
	{
		This_Keyword_Using_Global_Var t1=new This_Keyword_Using_Global_Var();
		t1.student_data(10, "Nitesh", 10.345);
		System.out.println(t1.studentid);
		System.out.println(t1.name);
		System.out.println(t1.marks);
		

	}

}
