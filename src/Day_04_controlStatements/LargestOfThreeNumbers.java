package Day_04_controlStatements;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First No:");
		int num1= sc.nextInt();
		System.out.println("Enter Second No:");
		int num2= sc.nextInt();
		System.out.println("Enter Third No:");
		int num3= sc.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("First No Is Largest No:"+num1);
		}
		else if(num2>num3) {
			System.out.println("Second No Is Largest No:"+num2);
		}
		else
		{
			System.out.println("Third No is Largest No:"+num3);
		}
		
	}

}
