package day19_Exceptios;

import java.util.Scanner;

class MyCheckedException extends Exception {

	public MyCheckedException(String message) {
		super(message);
	}
}

public class CheckedCustomeException {
	static void validateAge() throws MyCheckedException    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		if (age < 18) {
			throw new MyCheckedException("Age must be 18 or older");
		} else {
			System.out.println("Age is valid: " + age);
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(); // throw custom exception
		} catch (MyCheckedException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
		
		

	}

}
