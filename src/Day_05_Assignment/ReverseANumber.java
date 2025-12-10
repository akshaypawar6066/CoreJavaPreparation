package Day_05_Assignment;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		
		int revNo=0, rem=0, temp=num;
		
		while(num>0) {
			rem=num%10;
			revNo=revNo*10+rem;
			num=num/10;
		}
		System.out.println("Reverse No is:"+revNo);
	}

}
