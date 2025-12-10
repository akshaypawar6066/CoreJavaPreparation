package DAy06_Array_In_Java;

import java.awt.Window.Type;
import java.util.Scanner;

public class TakingMultipleInputFromKEyboard {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int a =sc.nextInt();
		double b = sc.nextDouble();
		System.out.println("Additioan of Two numbers are:"+(a+b));
		sc.close();
	}

}
