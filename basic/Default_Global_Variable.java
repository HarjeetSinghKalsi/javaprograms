package basic;

public class Default_Global_Variable
{
  int employeeid; //global variable
  double salary; //global variable 
  String name; //global variable
  
  void employee_details(int employee_id, double salary, String name)
  {
	  System.out.println("Hello");
  }
   
  
	public static void main(String[] args) {
		Default_Global_Variable n1=new Default_Global_Variable();
		n1.employee_details(11, 46665, "harjeet");
		System.out.println(n1.employeeid);// calling global variable
		

	}

}
