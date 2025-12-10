package JavaCodePractice_day_21;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindDuplicatesFromArray_Using_HashSet {
	
	public static void main(String[] args) {
		int a[] = {10,20,30,40,10,20,60};
		
		HashSet<Integer> seen = new HashSet<Integer> ();
		HashSet<Integer> duplicate = new LinkedHashSet<Integer> ();
		
		for(int num:a) {
			if(!seen.add(num)) {                         //return false if alreday exists.
				duplicate.add(num);
			}
		}
		System.out.println("Duplicate Numbers from Array are:"+duplicate);
	}

}
