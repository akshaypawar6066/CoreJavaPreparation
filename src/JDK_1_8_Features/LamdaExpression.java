package JDK_1_8_Features;

public class LamdaExpression {
	

	
	
	//Steps to make any function to lamda expression.
	/*
	1.Remove access modifier
	2.remove return type
	3.remove function name
	4.place arroe.
	*/
	
	public static void main(String[] args) {
		MyInterface obj=  ()->  {
			  System.out.println("Hello From Lamda...!!!");
			  System.out.println("Hi");
		  } ;
		obj.sayHello();
	}

}
