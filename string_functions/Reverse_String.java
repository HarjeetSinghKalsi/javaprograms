package string_functions;

public class Reverse_String {

	public static void main(String[] args)
	{
	
	  String input="harjeet";
	  System.out.println("my input is->" +input);
	  String output="";
	  for (int i= input.length()-1; i>=0; i--)
	  {
		 char c1=    input.charAt(i);
		 output = output+c1;
		 
	  }
	  System.out.println("my output is ->" + output);
	 		
		
		
		


		

	}

}
