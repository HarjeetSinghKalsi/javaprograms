package basic;

public class AreaOfCircle 

{
   static double pi=3.14;
   
   static void area1()
   {
	   int r=7;
	   double area=pi*r*r;
	   System.out.println(area);
   }
   static void area2()
   {
	   int r=2;
	   double area=pi*r*r;
	   System.out.println(area);
   }
   static void area3()
   {
	   int r=8;
	   double area=pi*r*r;
	   System.out.println(area);
   }
   static void area4()
   {
	   int r=3;
	   double area=pi*r*r;
	   System.out.println(area);
   }
     void area5()
   {
	   int r=2;
	   double area=pi*r*r;
	   System.out.println(area);
   }
	public static void main(String[] args) 
	{
		area1();
		area2();
		area3();
		area4();
		AreaOfCircle n1= new AreaOfCircle();
		n1.area5();
		
       

	}

}
