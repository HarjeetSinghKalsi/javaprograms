package basic;

public class Thread_Sleep_Using_Throws {

	public static void main(String[] args) throws InterruptedException
	{

		for (int i=0; i<11; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		
	}

}
