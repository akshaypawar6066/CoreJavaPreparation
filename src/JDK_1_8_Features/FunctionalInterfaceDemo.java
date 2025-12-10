package JDK_1_8_Features;

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		
		/*
		Employe employe = new SoftwareEngineer();  //Here we have used Employe Interface,  SoftwareEngineer class and Main class to call
		                                         \
		                                         
		                                              //Here we can use Functional Interface.To avaoid Implementation class.
		                                               * 
		                                               * 
		employe.getName();
		*/
		
	Employe employe=   () -> {
		   System.out.println("Name is:AKshay");
	   };
	   
	employe.getName();
	}

}
