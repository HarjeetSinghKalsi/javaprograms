package Inheritence1;

public class Multi_SubClass extends Multi2  
{
	
	void Accounts()
	{
		System.out.println("Learning Accounts");
	}
	
	static void leadership()
	{
		System.out.println("Learning leadership");
	}
	
public static void main(String[] args) {
	
	Multi_SubClass m1=new Multi_SubClass();
	
	leadership();
	m1.Accounts();
	
	m1.sql();
	python();
	
	m1.java();
	machinelearning();
	
	
	
	
	
}

}
