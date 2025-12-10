package Day_04_controlStatements;

import java.util.Scanner;

public class IFElseStatementDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person Age:");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Person is Eligible for vote:");
		}
		else {
			System.out.println("Person is Not eligible for vote:");
		}
		
	}

}
