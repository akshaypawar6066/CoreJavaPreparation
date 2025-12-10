package DAy06_Array_Practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num= sc.nextInt();
		int count=0;
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
	if(count==0) {
     System.out.println("Entered Number is a prime Number:"+num);		
	}
	else
	{
		System.out.println("Entered Number is not a prime Number:"+num);
	}
		
	}

}
