package CodePractice.GeneralNumbers;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfAllNumbers {
	public static void main(String[] args) {
		int a [] = {10,20,30,40,50,60,10,20,30,50,90};
		
		
		HashMap<Integer, Integer> countMap = new  HashMap<Integer, Integer>();
		
		for(int num :a) {
                countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:countMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}

}
