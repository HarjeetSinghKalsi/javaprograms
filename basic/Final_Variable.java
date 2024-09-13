package basic;

public class Final_Variable
{
	final static double pi=3.14;
	
	 static void area()
	{
		// pi=5.677; //updating pi value
		int r=3;
		double area1=pi*r*r;
		System.out.println(area1);
				
	}

 public static void main(String[] args)
	{
	 final  int noofdays=30;
    
      System.out.println(noofdays);
      area();

	}

}
