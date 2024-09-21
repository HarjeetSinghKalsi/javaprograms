package basic;

//converting one data type into another data type by 2 ways.
//narrowing and widing

public class Primitive_Type_Casting {

	public static void main(String[] args)
	{
		//widing concept
		int a=100;
		double a1 =  a; //widing [implicit]
		double a2 = (double) a; //widing [Explicit]
		System.out.println(a1);
		System.out.println(a2);
		
		
		//Narrowing concept
		double wt=70.5; //narrowing and can only be EXplictily
		int newwt= (int) wt;
		System.out.println(newwt);
		

	}

}
