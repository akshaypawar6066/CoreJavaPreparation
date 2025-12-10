package day18_castingInJava;

public class PremitiveCasting {
	
	public static void main(String[] args) {
		int a=100;
		long b=a;   //implicit/Widening casting
		System.out.println(b);
		
		
		int p =25;
		short s = (short)p;    //explicit/Narrowing casting
		System.out.println(s);
		
		
		
		int big =75000;
		short small = (short) big;
		
		System.out.println("Original int: " + big);
		System.out.println("After cast to short: " + small);
		
		
		int i =100;
		double f =i;
		
		System.out.println(f);
		
		
		double d=125.35;
		int z = (int)d;
		System.out.println(z);
		
		
	}

}
