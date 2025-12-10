package Day_04_controlStatements;

import java.util.Scanner;

public class EvenOrOddNo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any No:");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Entered No is Even No:"+num);
		}
		else
		{
			
			System.out.println("Entered No is Odd No:"+num);
		}
		sc.close();
	}

}
