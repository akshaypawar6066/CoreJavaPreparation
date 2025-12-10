package day19_Exceptios;

import java.util.Arrays;
import java.util.Scanner;

public class UnCheckedExceptios {

	public static void main(String[] args) {
		/*
		 * //1.Arithmatic Exception System.out.println("Program started...!!!");
		 * 
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * System.out.println("Enter a Number:"); int num = sc.nextInt();
		 * 
		 * try { System.out.println(100/num); //Risky code, Where excpetion can occur's
		 * } catch(ArithmeticException e) { System.out.println(100/10); //Exception
		 * Handling code. }
		 * 
		 * 
		 * 
		 * System.out.println("Program Finished...!!!");
		 * System.out.println("Program Exited...!!!");
		 * 
		 */

		// Example 2
		/*
		 * Scanner sc= new Scanner(System.in);
		 * 
		 * int a[] = new int[5];
		 * 
		 * System.out.println("Enter The position(0-4)"); //If index entered is >4, it
		 * will throw exception. int pos = sc.nextInt();
		 * System.out.println("Entera value:"); int value = sc.nextInt();
		 * 
		 * try { a[pos]=value; } catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Please enter the Index range from (0-4):"); }
		 * 
		 * System.out.println(a[pos]); System.out.println(Arrays.toString(a));
		 */

		// Can handle multiple exceptions in single try block.
		/*
		 * System.out.println("Program started...!!!");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a Number:"); int num = sc.nextInt();
		 * 
		 * String s =null;
		 * 
		 * try { System.out.println(100 / num); // Risky code, Where excpetion can
		 * occur' System.out.println(s.length());
		 * 
		 * } catch (ArithmeticException |NullPointerException e) {
		 * System.out.println("Cannot divide by zero:"); // Exception Handling code. }
		 * 
		 * System.out.println("Program Finished...!!!");
		 * System.out.println("Program Exited...!!!");
		 */

		String s = "Akshay:";
		int num = 25;

		System.out.println("Started...!!!");

		try {
			System.out.println(100 / num);
			System.out.println(s.length());
		}

		catch (ArithmeticException | NullPointerException e) {
			System.out.println("Something went wrong:" + e.toString());
		}

		finally {
			System.out.println("Finally block executes:");
		}

		System.out.println("Ended...!!!");

		try {
			System.out.println(100 / 0);
		} finally {
			System.out.println("Akshay...!!! Pawar...!!!");
			System.out.println("Akshay...!!! Pawar...!!!");
		}

	}

}
