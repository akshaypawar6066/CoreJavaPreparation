package day_12_PolymorphismDemo;

public class StaticMethodOverloading {
	
	
	//Static Method Overloading
	
	static void sum() {
		System.out.println("Sum method with No Argument:");
	}

	static void sum(int x, int y) {
		System.out.println("addition of Numbers are:" + (x + y));
	}
	
	static void sum(int x, double y) {
		System.out.println("addition of Numbers are:" + (x + y));
	}
	
	static void sum(double x, int y) {
		System.out.println("addition of Numbers are:" + (x + y));
	}
	
	public static void main(String[] args) {
		StaticMethodOverloading.sum();   //No Parameter
		StaticMethodOverloading.sum(100, 200);  //With Two parameters
	}
	

}
