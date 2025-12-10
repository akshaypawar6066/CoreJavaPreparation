package JavaCodePractice_day_21;

import java.util.HashSet;

public class FindDuplcateNoFromArray {
	
	public static void main(String[] args) {
		int a [] = {10,20,30,40,20,40,50};
		HashSet<Integer> seen = new HashSet<Integer> ();
		HashSet<Integer> duplicates = new HashSet<Integer> ();
		
		for(int num : a) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		
		System.out.println("Duplicate Numbers from array are:"+duplicates);
	}

}
