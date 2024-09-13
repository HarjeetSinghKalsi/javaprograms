package basic;

public class Static_Method {
	
	static void First() {
		System.out.println("first_method");
	}
	
	static void Second() {
		System.out.println("second_method");
	}
	
	static void Third() {
	 System.out.println("third_method");	
	}
	
	static void Fourth() {
		System.out.println("fourth_method");
	}
	
	static void Fifth() {
		System.out.println("fifth_method");
	}
	
	public static void main (String[] args) {
		
		System.out.println("main_method");
		First();
		Second();
		Third();
		Fourth();
		Fifth();
		
	}

}
