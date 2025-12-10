package day17_WrapperClasses_AcceesModifiers;

public class AceessModifiresDemo {
	
	//public int z=1000;
	public int a=100;
	int b=200;
	protected int c=300;
	private int d =400;
	
	public void TestPublicMethod() {
		System.out.println(a);
	}
	
	protected void TestProtectedMethod() {
		System.out.println(a);
	}
	
	void defaultTestMethod() {
		System.out.println(a);
	}
	
	
	private void testPrivateMethod() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		AceessModifiresDemo a = new AceessModifiresDemo();
		a.TestPublicMethod();  //Allowed everywhere
		a.defaultTestMethod(); //Within same package allowed
		a.TestProtectedMethod(); //Within same package allowed -->Outside package allowed with inheritence
		a.testPrivateMethod();  //Within same class where it is declared.
		
		a.d=900;   //Private 
		
	}
	

}
