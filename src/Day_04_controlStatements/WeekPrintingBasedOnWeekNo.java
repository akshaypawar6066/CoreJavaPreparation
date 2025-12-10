package Day_04_controlStatements;

import java.util.Scanner;

public class WeekPrintingBasedOnWeekNo {
	
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		
	        System.out.print("Enter week number (1-7): ");
	        int weekNo = sc.nextInt();

	        if (weekNo == 1) {
	            System.out.println("Day is Sunday");
	        }
	        else if (weekNo == 2) {
	            System.out.println("Day is Monday");
	        }
	        else if (weekNo == 3) {
	            System.out.println("Day is Tuesday");
	        }
	        else if (weekNo == 4) {
	            System.out.println("Day is Wednesday");
	        }
	        else if (weekNo == 5) {
	            System.out.println("Day is Thursday");
	        }
	        else if (weekNo == 6) {
	            System.out.println("Day is Friday");
	        }
	        else if (weekNo == 7) {
	            System.out.println("Day is Saturday");
	        }
	        else {
	            System.out.println("Invalid week number! Please enter 1-7.");
	        }

	        sc.close();
	    }

}
