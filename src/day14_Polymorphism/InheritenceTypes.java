package day14_Polymorphism;

class A {
	int a = 100;

	void display() {
		System.out.println("A value is:" + a);
	}

}

class B extends A {
	int b = 500;

	void show() {
		System.out.println("B value is:" + b);
	}

}

class C extends B {
	int c = 1000;

	void showData() {
		System.out.println("C value is:" + c);
	}

}

public class InheritenceTypes {

	public static void main(String[] args) {

		C childCLass = new C();
		childCLass.display();
		childCLass.show();
		childCLass.showData();

	}

}
