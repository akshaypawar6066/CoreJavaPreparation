package Day2_DataTypesAnd_Variables;

import java.lang.reflect.Method;

public class StaticAndNonStatcMethodCalls {
	
	void alpha() {
		System.out.println("I am non static Method:");
		beta();
	}
	
	static void beta() {
		System.out.println("I am a static method");
		b=700;
		
	}
	
	void gamma() {
		System.out.println(" I am another non static method:");
		alpha();
		a=500;
		b=700;
	}
	
	int a =20;
	static int b=100;
	
	public static void main(String[] args) {
		beta();
		
		StaticAndNonStatcMethodCalls s = new StaticAndNonStatcMethodCalls();
		s.gamma();
		
		int num ='A';
		System.out.println("num:"+num);
		char c =64;
		System.out.println("Chracter is:"+c);
    }

}
