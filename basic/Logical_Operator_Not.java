package basic;

public class Logical_Operator_Not {

	public static void main(String[] args) 
{
  int a=10;
  int b=20;
  if (!(a<5 && b==20)) //c1=F c2=F
  {
	  System.out.println("Hello");
  }
  if(!(a<6 || b==10))//c1=F c2=F
  {
	  System.out.println("Hello1");
  }
  
  if (!(a>6 && b==10))//C1=T c2T
  {
	  System.out.println("Hello2");
  }
  
}

}
