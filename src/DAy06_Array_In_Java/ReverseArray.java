package DAy06_Array_In_Java;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n= sc.nextInt();
		int a [] = new int[n];
		System.out.println("Enter Array Values:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Original Array:"+Arrays.toString(a));
		
		System.out.print("Array in reversed order is:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+",");
		}
	}

}
