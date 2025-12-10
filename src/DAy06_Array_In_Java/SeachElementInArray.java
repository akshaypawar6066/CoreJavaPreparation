package DAy06_Array_In_Java;

import java.util.Scanner;

public class SeachElementInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n =sc.nextInt();
		int a [] = new  int[n];
		
		System.out.println("Enter array VAlues:");
		
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter element that needs to be checked in array:");
		int num= sc.nextInt();
		boolean found = false;
		for(int i=0; i<a.length;i++) {
			if(a[i]==num) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Entered No is  present in the array:");
		}
		else
		{
			System.out.println("Entered No is not present in the array:");
		}
	}

}
