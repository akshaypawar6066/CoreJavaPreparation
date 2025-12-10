package Day_05_Assignment;

import java.util.Scanner;

public class CountNoOfDigitsInNumbers {
	
	public static void main(String[] args) {

		
			int num = 5498765;
			int count=0;
			while(num>0) {
				num=num/10;
				count++;
			}
			System.out.println("Count of digits in a number is:"+count);
			
	}

}

