package CodePractice.GeneralNumbers;

import java.util.Scanner;

public class CheckPrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		
		boolean isDivided=false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isDivided=true;
				break;
			}
		}
		
		if(isDivided) {
			System.out.println("Entered Number is not a prime Number:");
		}
		else
		{
			System.out.println("Entered number is a prime Number:");
		}
		
	}

}
