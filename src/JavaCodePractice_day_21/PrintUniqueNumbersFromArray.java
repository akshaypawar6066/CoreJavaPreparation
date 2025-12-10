package JavaCodePractice_day_21;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueNumbersFromArray {
	
	public static void main(String[] args) {
		int a [] = {10,20,30,40,20,40,50};
		HashSet<Integer> unique = new LinkedHashSet<Integer>();
		
		for(int num:a) {
			unique.add(num);
		}
		
		System.out.println("Unique No from Array:"+unique);
	}

}
