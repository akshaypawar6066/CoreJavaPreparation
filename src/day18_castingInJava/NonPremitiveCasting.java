package day18_castingInJava;

import java.util.Scanner;

class SuperClass {
	
	void testSuperMethod() {
		System.out.println("Super class method:");
	}
	
	String s ="Super class String Variable";

	
}

class SubClass extends SuperClass{
	
	void testSubclassMethod() {
		System.out.println("sub class method:");
		
	}
	
	int i=500;
	
	
}

public class NonPremitiveCasting {
 public static void main(String[] args) {
	 
	 SuperClass s = new SubClass();

	 
	 s.testSuperMethod();
	 System.out.println(s.s); 

	 
	 //here s.i  and s.testSubclassMethod()  will not be accessible as it is declared in the sublass and this method and variable  is not inherited from the Super class.
	  
	 //Down casting --->Getting exception at run time.
	 /*
    SubClass s =(SubClass) new SuperClass();
	System.out.iii(s.i);
	s.testSubclassMethod();
	System.out.println(s.s);
	s.testSuperMethod();
	*/
	 

	
 }
	 
}
