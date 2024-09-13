package basic;


import java.util.InputMismatchException;

public class Throws_Keyword {

	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if (10==1)
		{	
		throw new NullPointerException("sorry your cell is empty");
		}
		else 
		{
			throw new InputMismatchException("sorry check your input before entering");
		}

	}

}
