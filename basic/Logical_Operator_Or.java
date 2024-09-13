package basic;

public class Logical_Operator_Or {

	public static void main(String[] args) 
{
  int a=10;
  int b=20;
  if (a==20 || b==a) //false
  {
	  System.out.println("Block 1");
  }
    
  if (a==10 || b==a)
  {
	  System.out.println("Block2");
  }
}

}
