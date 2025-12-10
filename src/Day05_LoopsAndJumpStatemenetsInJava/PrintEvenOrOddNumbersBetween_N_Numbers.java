package Day05_LoopsAndJumpStatemenetsInJava;

import java.util.Scanner;

public class PrintEvenOrOddNumbersBetween_N_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int num = sc.nextInt();
		int i=1;
		System.out.print("Even No's from 1 to N numbers are:");
		while(i<=num) {
			if(i%2==0) {
				System.out.print(i+",");
			}
			i++;
		}
	}

}
