package CodePractice.Strings;

import java.util.HashMap;

public class OccurenceOfCharacterUsingHashMap {
	public static void main(String[] args) {
		
		String s = "I Love My India iiii";
		s=s.toLowerCase();
		char [] arr = s.toCharArray();
		HashMap<Character, Integer> charCount = new  HashMap<Character, Integer>();
		
		for(char ch : arr) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
		}
		
		Integer length=charCount.getOrDefault('d',0);
		
		System.out.println("Occurence of character  i is:"+length);
		
	}

}
