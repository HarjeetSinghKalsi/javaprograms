package basic;

public class Math_Random_Using_AOC 
{
	final static double  pi= Math.PI; //using final keyword in variable
	
	
	static void areaofcicle()
	{
		double r =Math.random();
		System.out.println("the value of r is ->" + r);
		double area=pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args)
	{
		Math_Random_Using_AOC.areaofcicle();
		

	}

}
