package basic;

//Q- if a single class have 10 catches then which catch will be execute, 
//ans - which ever exception will come at runtime

public class Exception_Handling_Multiple_Catches {

	public static void main(String[] args) 
	{
		try {
		int a =1/0;  //arithimatic exception
		System.out.println(a);
		}
		
		catch(ArithmeticException a1)
		
		{
			System.out.println("sorry but there was a blocker and we handle it 1");
		}
		
        catch(NullPointerException a2)
		
		{
			System.out.println("sorry but there was a blocker and we handle it 2");
		}
		
        catch(ArrayIndexOutOfBoundsException a3)
		
		{
			System.out.println("sorry but there was a blocker and we handle it 3");
		}
		
        catch(ClassCastException a4)
		
		{
			System.out.println("sorry but there was a blocker and we handle it 4");
		}
			

	}

}
