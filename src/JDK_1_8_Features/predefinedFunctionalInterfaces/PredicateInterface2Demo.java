package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

class Employe {
	String name;
	int emptID;
	int sallery;

	public Employe(String empName, int empId, int empSallery) {
		this.name = empName;
		this.emptID = empId;
		this.sallery = empSallery;
	}

}

public class PredicateInterface2Demo {

	public static void main(String[] args) {
		// Ex-1 -->Write lamda expression using Predicate Interface and check if
		// Sallery>50000 and empId>100 then print name of employe.
		/*
		 * Employe emp = new Employe("Akshay",101, 60000);
		 * 
		 * //Write lamda expression using Predicate Interface and check if Sallery>50000
		 * and empId>100 then print name of employe.
		 * 
		 * Predicate<Employe> checkEMploye = e-> (e.sallery>50000 && e.emptID>100) ;
		 * 
		 * if(checkEMploye.test(emp)) { System.out.println(emp.name);
		 * 
		 * 
		 * }
		 */

		// Ex-2 --->Do the same For Multiple Employe's

		Employe emp1 = new Employe("Akshay", 101, 110000);
		Employe emp2 = new Employe("Amol", 102, 75000);
		Employe emp3 = new Employe("Suraj", 95, 40000);
		Employe emp4 = new Employe("Kiran", 98, 49000);
		Employe emp5 = new Employe("Tushar", 103, 200000);

		Set<Employe> empSet = new HashSet<Employe>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);

		Predicate<Employe> empCheck = e -> (e.sallery > 115000 && e.emptID > 100);

		for (Employe emp : empSet) {
			if (empCheck.test(emp)) {
				System.out.println(String.format("Employe name is: %s and Employe sallery is %d", emp.name, emp.sallery));
			}
		}

	}

}
