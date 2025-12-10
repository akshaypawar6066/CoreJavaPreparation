package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class EmployeDeatils {
	String name;
	String gender;
	int salary;

	public EmployeDeatils(String empName, String empGender, int empSalary) {
		this.name = empName;
		this.gender = empGender;
		this.salary = empSalary;
	}

}

public class Predicate_Function_Consumner {

	public static void main(String[] args) {

		ArrayList<EmployeDeatils> empList = new ArrayList<EmployeDeatils>();
		empList.add(new EmployeDeatils("Akshay", "Male", 75000));
		empList.add(new EmployeDeatils("Amol", "Male", 80000));
		empList.add(new EmployeDeatils("Rohini", "Female", 85000));
		empList.add(new EmployeDeatils("Urmila", "Female", 90000));
		empList.add(new EmployeDeatils("Abhijit", "Male", 95000));

		Function<EmployeDeatils, Integer> bonusCalculator = e -> e.salary * 10 / 100;
		Predicate<Integer> bonusCheck = i-> i>8000;
		
		
		Random random = new Random();

		
		
		for(EmployeDeatils emp:empList) {
			int bonus=bonusCalculator.apply(emp);  //Invoked Function
			if(bonusCheck.test(bonus)) {           //Invoked Predicate
				Supplier<String> randonNumberSupplier = () -> String.valueOf(100+ random.nextInt(900));
				String emailId = emp.name.toLowerCase() + randonNumberSupplier.get()+"@gmail.com";      //Invoked Supplier
				
				Consumer<EmployeDeatils> empDetails = empData -> System.out.println(String.format("Employe name is:%s and Employe Gender is: %s and employe salary is:%d and genartedEmailId is:%s", empData.name, empData.gender, empData.salary, emailId));
				empDetails.accept(emp);          //Invoked Consumer
				
				System.out.println("Bonus is:"+bonus);
			}
		}

	};
}
