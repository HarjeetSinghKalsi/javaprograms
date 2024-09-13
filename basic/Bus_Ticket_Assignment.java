package basic;

public class Bus_Ticket_Assignment {

	public static void main(String[] args) 
	{
		char gender1='M';
		char gender2='F';
		
		int age=14;
		if(age<2 && gender1=='M')
		{
			System.out.println("Free");
		}
		   if(age>12 && gender1=='M')
		    {
			  System.out.println("half ticket");
		    }
		   else
		 {
			 System.out.println("ft");
		 }
		    if (age>13 && gender1=='M')
		      {
			     System.out.println("Full ticket");
		      }
		     if (age<60 && gender1=='M')
		      {
			     System.out.println("half ticket1");
		      }
		else
		{
			System.out.println("Free ticket1");
		}

	}

}
