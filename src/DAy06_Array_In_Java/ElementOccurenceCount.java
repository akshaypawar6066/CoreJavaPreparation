package DAy06_Array_In_Java;

import java.util.Scanner;

public class ElementOccurenceCount {

	public static void main(String[] args) {
		int z = 10;
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter array Values:");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter element for which Occurence count needed:");
		int num = sc.nextInt();

		int count = 0;
		for (int x : a) {

			if (x == num) {
				count++;
			}
		}
		System.out.println("Count of Expected Number in Array is:" + count);

	}

}
