package string_functions;

public class Palindrome {

	public static void main(String[] args) {
		
		String input="radar";
		System.out.println("my input is ->" +input);
		String output="";
		
		for(int i= input.length()-1; i>=0; i--)
		{
		  char c1=	  input.charAt(i);
		  output=output+c1;
		}
		  System.out.println("my output is ->" +output);
		  
		  if (input.equals(output))
		  {
			  System.out.println("it is palindorme");
		  }
		  else
		  {
			  System.out.println("it is NOT palindorme");
		  }

	}

}
