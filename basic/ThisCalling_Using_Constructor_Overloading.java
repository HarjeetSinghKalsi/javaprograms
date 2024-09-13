package basic;

  class ThisCalling_Using_Constructor_Overloading
  {
	  //constructor 1
	  ThisCalling_Using_Constructor_Overloading (String name) //parameterized constructor
	  {
		System.out.println("constructor with name");
	  }
	
	 //constructor 2
	 ThisCalling_Using_Constructor_Overloading(int a)
	  {
		this("harjeet"); 
		System.out.println("constructor with int");
	  }
	 	
	 //constructor 3
	 ThisCalling_Using_Constructor_Overloading(char m)
	  {
		this (1);
		System.out.println("constructor with char");
	  }
	 
	 //constructor 4
	 ThisCalling_Using_Constructor_Overloading()
	  {
		this ('Z');
		System.out.println("constructor with non para");
	  }
	 
	 
	public static void main(String[] args)
	{
		
	 new ThisCalling_Using_Constructor_Overloading();
		
			
	}	
	

}
	

