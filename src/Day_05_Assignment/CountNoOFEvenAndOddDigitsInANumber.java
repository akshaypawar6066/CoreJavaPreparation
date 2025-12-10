package Day_05_Assignment;

import java.util.Scanner;

import Day_04_controlStatements.EvenOrOddNo;

public class CountNoOFEvenAndOddDigitsInANumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		int evenNoCount=0, oddNoCount=0,  rem=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			if(rem%2==0)
			{
				evenNoCount++;
			}
			else
			{
				oddNoCount++;
			}
		}
		System.out.println("Even No Of digits are:"+evenNoCount);
		System.out.println("Odd No Of digits are:"+oddNoCount);
	}

}
