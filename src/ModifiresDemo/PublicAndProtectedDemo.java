package ModifiresDemo;
import day17_WrapperClasses_AcceesModifiers.AceessModifiresDemo;

public class PublicAndProtectedDemo extends AceessModifiresDemo {
	
	public static void main(String[] args) {
		
		AceessModifiresDemo a = new AceessModifiresDemo();
		a.TestPublicMethod();          //Public method accessible everywhere
		a.a=600;         //Public 
		
		PublicAndProtectedDemo a1 = new PublicAndProtectedDemo();
		a1.TestProtectedMethod();   //Protected method accessible outide package with inheritence
		a1.c=500;       //Protceted
		
	}
}


