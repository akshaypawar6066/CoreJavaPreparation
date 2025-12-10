package day_13_This_Super_Static_Fina_Keywords;

   class Parent {
	final  int x=10;
	
	 static  void show() {
		System.out.println("Parent class method:");
	}
}
  
  class Child extends Parent {             //Cannot inheritared final class.
	static void show() {        //Cannot overide final method.
		System.out.println("Child class method:");

}
  }




  
public class FinalKeyword {
	public static void main(String[] args) {
		/*
		Parent p = new Parent();
		System.out.println(p.x);
	//	p.x=500;     //Final variable can not changes
		System.out.println(p.x);
		*/
		
		Parent p = new Parent();
		p.show();
		
		Child c = new Child();
		c.show();
	}
}


