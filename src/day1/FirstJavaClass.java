package day1;

public class FirstJavaClass {

	void dsplay() {
		System.out.println("Test Project:");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
	}

	static int count;
	int a;

	void counter() {
		count++;
		a++;
		System.out.println(String.format("Count is:%d  and a value is:%d", count, a));
	}


	public static void main(String[] args) {

		FirstJavaClass f1 = new FirstJavaClass();
		FirstJavaClass f2 = new FirstJavaClass();
		f1.counter();
		f2.counter();
	}

}
