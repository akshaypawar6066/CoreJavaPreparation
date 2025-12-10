package day15_Abstraction;


interface Inter {
	void m1();
}

abstract class Demo implements Inter {
	public void m1() {
		System.out.println("M1");
	}
}



public class TestDemo extends Demo{

	
	public static void main(String[] args) {
		TestDemo d = new TestDemo();
		d.m1();
	}

}
