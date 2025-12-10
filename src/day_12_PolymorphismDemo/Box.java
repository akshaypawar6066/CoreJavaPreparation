package day_12_PolymorphismDemo;

public class Box {
	//Constrctor Overloading
	double height, width, depth;

	public Box() {
		height = width = depth = 0;
	}

	public Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	public Box(double len) {
		width = height = depth = len;
		
	}
	
	double  calculateVoulumeOfBox() {
		return (height*depth*width);
	}
	
	public static void main(String[] args) {
		Box b1=  new Box();
		System.out.println(b1.calculateVoulumeOfBox());;
		Box b2=  new Box(10.0,20.5,30.6);
		System.out.println(b2.calculateVoulumeOfBox());;
		Box b3=  new Box(25.0);
		System.out.println(b3.calculateVoulumeOfBox());;
	}
}
