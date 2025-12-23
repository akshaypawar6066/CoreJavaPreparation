package CodePractice.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharactersFromString {
	public static void main(String[] args) {
		String s ="Programming";
		s=s.toLowerCase();
		
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		
		for(char ch:s.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		
		System.out.print("Duplicate Chacaters are:");
		for(Map.Entry<Character, Integer> entry:countMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
