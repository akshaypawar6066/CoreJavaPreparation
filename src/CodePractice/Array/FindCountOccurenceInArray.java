package CodePractice.Array;

import java.util.Scanner;

public class FindCountOccurenceInArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int a [] =new int [sc.nextInt()];
		
		System.out.println("Enter array values:");
		
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println("Enter the number for which it's occurence count needs to be calculated:");
		int num= sc.nextInt();
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				count++;
			}
			
			
		}
		
		System.out.println("Occurence of the number is:"+count);
	}

}
