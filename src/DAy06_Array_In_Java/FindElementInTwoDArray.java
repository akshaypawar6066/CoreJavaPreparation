package DAy06_Array_In_Java;

import java.util.Scanner;

public class FindElementInTwoDArray {

	public static void main(String[] args) {
	
		int a [][] = new int[][] {{10,20,30}, {40,50,60}, {70,80,90}};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No to find in array:");
		int num= sc.nextInt();
		boolean found=false;
		
		for(int rows[]: a) {
			for(int x:rows) {
				if(x==num) {
					found=true;
					break;
				}
			}
		}
		if(found) {
			System.out.println("Number Found:");
		}
		else {
			System.out.println("Number Not Found:");
		}

	}

}
