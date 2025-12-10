package day3_Operators;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		int a=20, b=10;
		/*
		 * 
		 //Without using third variable
		a=a-b;
		b=a+b;
		System.out.println("Value of a is:"+a+ " and  Value of b is:"+b);
		*/
		
		//Using third variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a is:"+a+ " and  Value of b is:"+b);
		
	}
	

}
