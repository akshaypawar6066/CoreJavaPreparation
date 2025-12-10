package Day_04_controlStatements;

import java.util.Scanner;

public class CheckNoIsPositiveNegativeOrZero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any No:");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Entered No is Positive No:"+num);
		}
		else if(num<0) {
			System.out.println("Entered No is Negatiive No:"+num);
		}
		else
		{
			System.out.println("No is Zero:"+num);
		}
	}

}
