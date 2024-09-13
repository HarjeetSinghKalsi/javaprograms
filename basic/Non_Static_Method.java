package basic;

public class Non_Static_Method 
{
	 void add()
	 {
     int a=10;
     int b=20;
     int sum=a+b;
     System.out.println(sum);
     }
	 
	 void sub() 
	 {
		 int a=10;
		 int b=20;
		 int sub=a-b;
		 System.out.println(sub);
	 }
public static void main(String[] args)
	{
	  Non_Static_Method n1=new Non_Static_Method();
	  n1.add();
	  n1.sub();

	}

}
