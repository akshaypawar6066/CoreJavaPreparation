package day3_Operators;

public class OpeartorsDemo {
	
	public static void main(String[] args) {
		/*
		//1.Arithmatic
		// + - * / %
		
		int a =40, b= 20;
		System.out.println("Addition is:"+(a+b)+ " substaction is:"+(a-b)+" multiplcation is:"+(a*b)+ " Division is:"+(a/b)+ " Modular is:"+(a%b));
	
		
		//2.Relational  ---> >, >=, <, <=, !=, ==
		//(returns boolean value--->true/false)
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		
		//3.Logical Operator --> && , ||, !
		//(returns boolean value--->true/false)  -->Used to add multiple conditions in a single statement  ->Works between two boolean values.  (Excepet Not)
		
		
		int a =10, b=20,c=40, d=50;
		System.out.println((a<b)||(c>d));
		
		boolean x =true, y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x+ " And "+ (!y));
		*/
		//4.Incremental/Decremental Operator ---> ++, --
		//To Incremenet or Decrement the values of the variables.
		
		//Case 1
		/*
		int a =10;
		System.out.println(a);
		a++;
		System.out.println(a);
		*/
		
		//Caee 2   (Post Increment)
		/*
		int a =10;
		int result = a++;   //Firt value of a will assign to result and then t will get incremented.
		System.out.println(result);
		System.out.println(a);
		*/
		//Case 3   (Pre Incremenet)
		/*
		int a =10;
		int result = ++a;   //Firt increment will happen and then value get assigned to result.
		System.out.println(result);
		System.out.println(a);
		*/
		//Case 4   (Post decrement)
		/*
		int a =10;
		int result = a--;   //Firt value of a will assign to result and then it will get decremeneted.
		System.out.println(result);
		System.out.println(a);
		*/
		
		//Case 5 (Pre decrement)
		
		int a =10;
		int result = --a;   //Firt decrement will happen and then value get assigned to result.
		System.out.println(result);
		System.out.println(a);
		
		

		
		
		
		
		
		
	}

}
