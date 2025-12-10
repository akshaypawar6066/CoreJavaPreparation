package Day_04_controlStatements;

import java.util.Scanner;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Week Number:1-7");
		int weekNo = sc.nextInt();
		switch (weekNo) {
		case 1:
	        System.out.println("Day is Sunday");
	        break;
	    case 2:
	        System.out.println("Day is Monday");
	        break;
	    case 3:
	        System.out.println("Day is Tuesday");
	        break;
	    case 4:
	        System.out.println("Day is Wednesday");
	        break;
	    case 5:
	        System.out.println("Day is Thursday");
	        break;
	    case 6:
	        System.out.println("Day is Friday");
	        break;
	    case 7:
	        System.out.println("Day is Saturday");
	        break;
	    default: 
	    	System.out.println("Invalid week number! Please enter 1-7.");
		
		}
		
		
	}

}
