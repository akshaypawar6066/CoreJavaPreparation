package CodePractice.Strings;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueCharactersFromString {
	public static void main(String[] args) {
		
		String s ="Programming";
		s=s.toLowerCase();
		
		HashMap<Character, Integer>  countMap = new HashMap<Character, Integer>();
		
		for(char ch: s.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		System.out.print("Unique characters are: ");
		
		for(Map.Entry<Character, Integer> entry:countMap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
