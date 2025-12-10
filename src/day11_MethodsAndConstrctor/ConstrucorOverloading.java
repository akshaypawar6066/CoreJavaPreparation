package day11_MethodsAndConstrctor;

public class ConstrucorOverloading {
	
	int x, y;
	
	public ConstrucorOverloading() {
		x=100;
		y=200;
	}
	
	public ConstrucorOverloading(int c) {
		x=c;
	}
	
	public ConstrucorOverloading(int a , int b) {
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println("Sum of Xand Y is:"+(x+y));
	}

	
	public static void main(String[] args) {
		ConstrucorOverloading  con= new ConstrucorOverloading(500,1000);
		con.sum();
	}

}
