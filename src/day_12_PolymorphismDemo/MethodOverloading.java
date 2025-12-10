package day_12_PolymorphismDemo;

public class MethodOverloading {
	
	//Method Overloading
	
	void sum() {
		System.out.println("Sum method with No Argument:");
	}

	void sum(int x, int y) {
		System.out.println("addition of Numbers are:" + (x + y));
	}
	
	void sum(int x, double y) {
		System.out.println("addition of Numbers are:" + (x + y));
	}
	
	void sum(double x, int y) {
		System.out.println("addition of Numbers are:" + (x + y));
	}
	
	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		m.sum();   //No Parameter
		m.sum(100, 200);  //With Two parameters
		m.sum(10.20,20);  //double, int
		m.sum(20,20.20);  //int, double
	}
	
	
}

