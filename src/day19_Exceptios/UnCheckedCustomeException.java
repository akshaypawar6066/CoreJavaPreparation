package day19_Exceptios;

import java.util.Scanner;

class MyUncheckedException extends RuntimeException {
	public MyUncheckedException(String message) {
		super(message);
	}
}

public class UnCheckedCustomeException {
	
	static void checkBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Balance:");
		int balance = sc.nextInt();
		
		if(balance<1000) {
			throw new MyUncheckedException("Balance is too low...!!!");
		}
		else
		{
			 System.out.println("Transaction successful");
		}
		
		
	}
	
	public static void main(String[] args) {
		checkBalance();
		System.out.println();
	}

}
