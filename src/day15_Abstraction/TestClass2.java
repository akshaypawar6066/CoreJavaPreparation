package day15_Abstraction;

interface Test1 {
	void m1();

}

interface Test2 {
	void m2();

}

public class TestClass2 implements Test1, Test2 {
	@Override
	public void m2() {
		System.out.println("M2");
	}

	@Override
	public void m1() {
		System.out.println("M1");
	}

	public static void main(String[] args) {
		Test1 t1 = new TestClass2();
		Test2 t2 = new TestClass2();

		t1.m1();
		t2.m2();

	}
}
