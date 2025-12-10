package day3_Operators;

public class TernaryOperator {
	
	public static void main(String[] args) {
		//Ternary Operator
		//Syntax--->   var = expression ? result1:result2
		
		//if expression is true then  a value will get assigned to x and If expression is false then b value get assigned to x.
		
		//ex-1;
		/*
	  int a=200,b=300;
	  int x = (a>b)? a:b;
	  System.out.println(x);
	  */
		
		//ex-2
		//int x =(1==1)? 100:200;
		//System.out.println(x);
		
		//int x =(1==2)? 100:200;
		//System.out.println(x);
		
		//ex-3
		int person_age=30;
		String result=(person_age>18)? "Eligible for vote": "Not eligible for vote";
		System.out.println(result);
		
		//ex-4
		int a=10, b=05;
		boolean myResult = (a>b)? true: false;
		System.out.println(myResult);
	}

}
