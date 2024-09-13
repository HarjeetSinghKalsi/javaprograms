package array_problems;

public class Array_Prblm6 {
	
	//find out the count given in String  and find out how many count of alphabet, numeric, special char, spaces
	
	public static void main(String[] args) {
		
		int count_of_alphabet=0;
		int count_of_number=0;
		int count_of_white_Space=0;
		int count_of_special_character=0;
		
		String a="harjeet kalsi 7047 !!#^@$";
		char[] c1=  a.toCharArray();
		
	//****************************************************************	
	//count_of_alphabet
		for(int i=0; i<a.length();i++)
		{
		boolean b1=  Character.isLetter(c1[i]);
		if(b1==true)
		{
			count_of_alphabet++;
		}
		}
		System.out.println("The number of alphabet are ->" + count_of_alphabet);
		
	//************************************************************************************************
		//count_of_number	
		
	
		for(int i=0; i<a.length();i++)
		{
		boolean b2=  Character.isDigit(c1[i]);
		if(b2==true)
		{
			count_of_number++;
		}
		}
		System.out.println("The number of number are ->" + count_of_number);
		
	//*********************************************************************************************************
	//count_of_white_space	
		
		for(int i=0; i<a.length();i++)
		{
		boolean b3=  Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			count_of_white_Space++;
		}
		}
		System.out.println("The number of space are ->" + count_of_white_Space);
		
	//*********************************************************************************************************************
   //count_of_special_character
		
		for(int i=0; i<a.length()-(count_of_alphabet+count_of_number+count_of_white_Space) ; i++)
		{
		boolean b4=  Character.isLetterOrDigit(c1[i]);
		if(b4==true)
		{
			count_of_special_character++;
		}
		}
		System.out.println("The number of special character are ->" + count_of_special_character);
		
		
		
		
}
}

