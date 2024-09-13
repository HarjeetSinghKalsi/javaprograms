package Inheritence1;

public class Student_Sing extends Teacher_Sing

{
	
	static void jenkins()
	{
		System.out.println("jenkins");
	}
	
	 void Git()
	{
		System.out.println("git");
	}
  public static void main(String[] args) {
	 
	  Student_Sing s1 =new Student_Sing(); 
	  s1.sql();
	  s1.selenium();
	  s1.Git();
	  jenkins();
	  java();
}
  
}
