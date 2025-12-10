package day11_MethodsAndConstrctor;

public class Greetings {
	
	
	//1.No Parameter , No Return Value
	void m1() {
		System.out.println("Hello");
	}
	
	//2.No Parameter, Return Value
	String m2() {
		return "Hellow, How are you" ;
	}
	
	//3.Take Parametr but no return value.
	void m3(String personName) {
		System.out.println("Hello:"+personName);
	}
	
	//4.Take paramter and return value.
	
	String m4(String personName) {
		return "Hello:"+personName;
	}

}
