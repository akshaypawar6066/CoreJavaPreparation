package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeData {
	String name;
	int salary;

	public EmployeData(String empName, int empSalary) {
		this.name = empName;
		this.salary = empSalary;
	}

}

public class FunctionClassDemo2 {
	public static void main(String[] args) {
		// Calculate Bonus based on Salary and return it.

		ArrayList<EmployeData> empList = new ArrayList<EmployeData>();
		empList.add(new EmployeData("Akshay", 75000));
		empList.add(new EmployeData("Amol", 80000));
		empList.add(new EmployeData("Suraj", 85000));
		empList.add(new EmployeData("Kiram", 90000));
		empList.add(new EmployeData("Abhijit", 95000));

		Function<EmployeData, Integer> empBonusCalculator = e -> {
			int sal = e.salary;
			int bonus = 0;

			if (sal >= 70000 && sal < 80000) {
				bonus = sal * 10 / 100;
			} else if (sal >= 80000 && sal < 90000) {
				bonus = sal * 15 / 100;
			} else if (sal >= 90000) {
				bonus = sal * 20 / 100;
			}
			return bonus;

		};
		
		
    Predicate<Integer> p = i -> i>10000;
		for (EmployeData emp : empList) {
			
			
			int bonus=empBonusCalculator.apply(emp);
			
			//If bonus is >10000 then only print the Employe details.
			if(p.test(bonus)) {
	            System.out.println(String.format("Employe Name is: %s and Employe Salary is: %d and Employe Bonus is: %d", emp.name, emp.salary,bonus));

			}
		}
	}
}
