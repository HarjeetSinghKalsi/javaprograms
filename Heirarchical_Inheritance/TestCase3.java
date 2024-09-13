package Heirarchical_Inheritance;

public class TestCase3 extends Login_To_Amazon
{
   void cart()
   {
	System.out.println("Cart");   
   }
   
   public static void main(String[] args) {
	
	   TestCase3 n1=new TestCase3();
	   login();
	   n1.cart();
	   
			   
}
}
