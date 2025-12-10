package Day_04_controlStatements;

import java.util.Scanner;

public class IfStatementDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person age:");
		int person_age= sc.nextInt();
		if(person_age>=18) {
			System.out.println("Person Is Eligible for vote:");
		}
		sc.close();
	}

}
