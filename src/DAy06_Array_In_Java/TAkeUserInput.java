package DAy06_Array_In_Java;

import java.util.Scanner;

public class TAkeUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		
		double num=sc.nextDouble();
		System.out.println("Entered Number is:"+num);
		System.out.println("Enter Name:");
		String s =sc.next();
		System.out.println("Entered Name:"+s);
		sc.close();
	}

}
