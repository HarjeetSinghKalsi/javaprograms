package assert_package;

//continue keyword is used to skip the iteration

public class Continue_Keyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if (i==4)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
