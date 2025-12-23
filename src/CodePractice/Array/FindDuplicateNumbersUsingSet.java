package CodePractice.Array;

import java.util.HashSet;

public class FindDuplicateNumbersUsingSet {
	
	public static void main(String[] args) {
		
		int a []= {10,20,10,30,20,50,60,50};
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<Integer> dupValues = new HashSet<Integer>();
		
		
		for(int num:a) {
			 if(!hashSet.add(num)) {
				 dupValues.add(num);
			 }
		}
		
		System.out.println("Duplicate elements from Array are:"+dupValues);
		
	}

}
