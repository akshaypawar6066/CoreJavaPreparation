package day11_MethodsAndConstrctor;

public class GreetingMainCLass {

	public static void main(String[] args) {
		
		Greetings greetings= new Greetings();
		
		greetings.m1();
		
		String s=greetings.m2();
		System.out.println(s);
		
		greetings.m3("Akshay");
		
		String s1=greetings.m4("Don");
		System.out.println(s1);
		
		
	}

}
