package basic;

//"Assignment 9 WAP in which there are 3 static methods,3 nonstatic methods & 3 constructors.. 
//3 static methods can be parameterized? 3 non-static methods can be parameterized? 3 Constructors can be parameterized?"

public class Combination_Of_3Constructor_Static_NonStatic_Methods 
{
    //first  3para static methods
	static void add(float a)
	{
		System.out.println(a);
	}
	
	static void add(char M)
	{
		System.out.println(M);
	}
	
	static void add(boolean T)
	{
		System.out.println(T);
	}
	
	 //two 3para non static methods
	   void add(String  w)
	   {
		System.out.println(w);
	   }
	
       void add(String name, char a)
	    {
		System.out.printf(name,a);
		
	    }
	
	  void add (String name,String pwrd, boolean z)
	    {
		System.out.printf(name,pwrd, z);
		
     	}
	
	//three 3para constructor
	Combination_Of_3Constructor_Static_NonStatic_Methods(double a)
	{
		System.out.println(a);
	}
	
	Combination_Of_3Constructor_Static_NonStatic_Methods(String email,float h, float i)
	{
		System.out.printf(email,h, i);
		
	}
	
	Combination_Of_3Constructor_Static_NonStatic_Methods(String name)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	
	{
	
		add(3.14f);
		add('A');
		add(false);
		
		Combination_Of_3Constructor_Static_NonStatic_Methods n1 =new Combination_Of_3Constructor_Static_NonStatic_Methods("kalsi");
		n1.add("kalsi");
		Combination_Of_3Constructor_Static_NonStatic_Methods n2 =new Combination_Of_3Constructor_Static_NonStatic_Methods("singh, M");
		n1.add("singh", 'M');
		Combination_Of_3Constructor_Static_NonStatic_Methods n3 =new Combination_Of_3Constructor_Static_NonStatic_Methods("harj ,password@123, true");
		n1.add("harj", "password@123", true);
		
		
		Combination_Of_3Constructor_Static_NonStatic_Methods n4 = new Combination_Of_3Constructor_Static_NonStatic_Methods("3.5676566");
        new Combination_Of_3Constructor_Static_NonStatic_Methods("hkalsi@gmail.com,3.454646,2.455");
		new Combination_Of_3Constructor_Static_NonStatic_Methods("harjeet");
		
		
		
		

	}

}
