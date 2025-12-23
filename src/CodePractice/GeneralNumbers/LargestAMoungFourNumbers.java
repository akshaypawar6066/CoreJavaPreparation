package CodePractice.GeneralNumbers;

import java.util.Scanner;

public class LargestAMoungFourNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any four numbers:");
	
		
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		int num3 =sc.nextInt();
		int num4= sc.nextInt();
		
		if(num1>num2 && num1>num3&&num1>num4) {
			System.out.println("Num1 is largest number:"+num1);
		}
		else if(num2>num3&&num2>num4) {
			System.out.println("Num2 is largest number:"+num2);
		}
		else if(num3>num4) {
			System.out.println("Num3 is largest number:"+num3);
		}
		else {
			System.out.println("Num4 is largest number:"+num4);
		}
		
		
	   
	}
	

}
