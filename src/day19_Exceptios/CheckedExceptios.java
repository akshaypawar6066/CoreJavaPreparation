package day19_Exceptios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptios {
	
	public static void main(String[] args) throws FileNotFoundException  {
		System.out.println("Program started...!!!");
		System.out.println("Program Is In Progress...!!!");
		
		//Thread.sleep(5000);                 //throws keyword is used here to handle the intrepted exception
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		System.out.println("Program Finished...!!!");
		System.out.println("Program Exited...!!!");
		/*
		
		try {
			FileInputStream fis = new FileInputStream("c/text.csv");   //Handled FileNotFoundException with try-catch block
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		*/
		
			FileInputStream fis = new FileInputStream("c/text.csv");   //Handled FileNotFoundException with throws keyword.

		
		System.out.println("Test Data");
	}

}
