package CodePractice.GeneralNumbers;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anu number:");
		int num = sc.nextInt();
		int factorial=1;
		int temp=num;
		
		while(num>0) {
			 factorial= factorial*num;
			 num--;
		}
		
		num=temp;
		
		System.out.println(String.format("Factorial of %d is:", num)+factorial);
	}

}
