package day_13_This_Super_Static_Fina_Keywords;

public class StaticMethodsAndVariablesDemo {

	static int a = 10; // static variable
	int b = 20; // Non static Variable

	static void m1() { // static method
		System.out.println("This is m1 static method....");

	}

	void m2() { // Non static method
		System.out.println("This is m2 non static method....");

	}

	public static void main(String[] args) {
		StaticMethodsAndVariablesDemo s = new StaticMethodsAndVariablesDemo();
		System.out.println(StaticMethodsAndVariablesDemo.a);
		System.out.println(s.b);
		StaticMethodsAndVariablesDemo.m1();
		s.m2();

	}

}
