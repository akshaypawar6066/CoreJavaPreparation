package day15_Abstraction;

abstract class Alpha {
	abstract void m1();
}

interface I1 {
	void m2();
}


interface I2 {
	void m3();
}

class Beta extends Alpha implements I1, I2 {
	
	public void m1() {
		System.out.println("I am M1:");
	}
	
	public void m2() {
		System.out.println("I am M2:");
	}
	
	public void m3() {
		System.out.println("I am M3:");
	}
}

public class TestClass {
public static void main(String[] args) {
	Beta b = new Beta();
	b.m1();
	b.m2();
	b.m3();
}
}
