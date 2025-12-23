package CodePractice.GeneralNumbers;

import java.util.Scanner;

public class ArmStronNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = sc.nextInt();

		int rem = 0, digit = 0, sum = 0, power = 0;
		int temp = num;

		while (num > 0) {
			num = num / 10;
			digit++;
		}
		
		num = temp;
		
		
		while (num > 0) {
			rem = num % 10;
			power = (int) Math.pow(rem, digit);
			sum = sum + power;
			num = num / 10;

		}

		num = temp;
		if (num == sum) {
			System.out.println("Entered number is Armstrong number:");
		} else {
			System.out.println("Entered Number is not a Armstrong Number:");
		}
	}

}
