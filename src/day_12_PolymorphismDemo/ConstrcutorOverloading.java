package day_12_PolymorphismDemo;

public class ConstrcutorOverloading {
	
	int x=100,y=200;
	
	public ConstrcutorOverloading() {
		System.out.println("Addtion of two numbers are:"+(x+y));
	}
	
	public ConstrcutorOverloading(int x, int y) {
		System.out.println("Addtion of two numbers are:"+(x+y));
	}
	
	public ConstrcutorOverloading(double x, int y) {
		System.out.println("Addtion of two numbers are:"+(x+y));
	}
	
	public ConstrcutorOverloading(int x, double y) {
		System.out.println("Addtion of two numbers are:"+(x+y));
	}
	public static void main(String[] args) {
		ConstrcutorOverloading c1 = new ConstrcutorOverloading();
		ConstrcutorOverloading c2 = new ConstrcutorOverloading(10,20);
		ConstrcutorOverloading c3 = new ConstrcutorOverloading(100,200.20);
		ConstrcutorOverloading c4 = new ConstrcutorOverloading(200.20,500);
	}

}
