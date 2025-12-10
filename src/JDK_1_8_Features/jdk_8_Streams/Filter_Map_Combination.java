package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employe {
	int empId;
	String empName;
	int empSalary;
	
	
	public Employe(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName= empName;
		this.empSalary = empSalary;
	}
}

public class Filter_Map_Combination {

	public static void main(String[] args) {
		
		List<Employe> employeList = new ArrayList<Employe>();
		
		List<Integer> empBonus = new ArrayList<Integer>();
		
		employeList.add(new Employe(101, "Akshay", 110000));
		employeList.add(new Employe(102, "Amol", 115000));
		employeList.add(new Employe(103, "Suraj", 75000));
		employeList.add(new Employe(104, "Kiran", 85000));
		employeList.add(new Employe(105, "Tushar", 65000));
		
		//Filter employe whose salary is >75000 and then find bonus for that employe as 10%
		
		empBonus=	employeList.stream().filter(emp->emp.empSalary>75000).map(emp->emp.empSalary*10/100).collect(Collectors.toList());
		System.out.println(empBonus);
		

	}

}
