package JDK_1_8_Features;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		/*
		 * Employe employe = new SoftwareEngineer(); //Here we have used Employe
		 * Interface, SoftwareEngineer class and Main class to call \
		 * 
		 * //Here we can use Functional Interface.To avaoid Implementation class.
		 * 
		 * 
		 * employe.getName();
		 */
		
		/*

		Employe employe = () -> {
			System.out.println("Name is:Akshay");
		};

		employe.getName();
	}
	*/
		
		//Using normal way--->
    Employe emp=  new SoftwareEngineer();
    emp.getName("Akshay", 28);   //Here we have used Another implementation class(SoftwareEngineer)  
    
    
    //Using Lamda Ezpression  ---> We can avaoid the separate implemenation class.
   Employe emp1= (name, age)-> System.out.println("Name of employe is:"+name+" and age of employe is:"+age);
   emp1.getName("Amol", 30);
		
		
	}
}
