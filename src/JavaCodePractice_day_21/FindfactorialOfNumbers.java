package JavaCodePractice_day_21;

import java.util.Scanner;

public class FindfactorialOfNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Interger No for whiich factorial Needs to calculate:");
		int num = sc.nextInt();
		int temp=num;
		
		int factorial=1;
		
		while(num>0) {
			factorial = factorial*num;
			num--;
		}
		
		num=temp;
		
		System.out.println(String.format("The factorilal of Given Number: %d is:"+factorial, num));
		
	}

}
