package Day_05_Assignment;

import java.util.Scanner;

public class SumOfDigitsInANumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number:");
	int num = sc.nextInt();
	
	int sum=0, rem;
	while(num>0) {
		rem=num%10;
		sum =sum+rem;
		num=num/10;
	}
	System.out.println("Sum of dgits in an Number is:"+sum);
   }
}
