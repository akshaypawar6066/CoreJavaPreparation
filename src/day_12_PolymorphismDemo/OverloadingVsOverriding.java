package day_12_PolymorphismDemo;

class ABC {
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC {
	
	@Override                //Overiding
	void m1(int a) {
		System.out.println(a*a);
	}
	
	@Override
	void m2(int b) {
		System.out.println(b*b);
	}
	
	void m2(int a, int b) {   //Overloading
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {
	
	public static void main(String[] args) {
		XYZ x = new XYZ();
		
		
		x.m1(15);
		x.m2(25);
		x.m2(20, 20);
		
		
	}

}
