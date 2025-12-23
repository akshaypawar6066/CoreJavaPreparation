package CodePractice.GeneralNumbers;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");

		int num = sc.nextInt();
		int temp = num;

		int rev = 0, rem = 0;

		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		num = temp;

		if (num == rev) {
			System.out.println("Entered number is palindrome number:");
		} else {
			System.out.println("Entered number is not a palindrome number:");
		}
		
		sc.close();

	}

}
