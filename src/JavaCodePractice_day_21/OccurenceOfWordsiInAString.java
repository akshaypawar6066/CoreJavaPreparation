package JavaCodePractice_day_21;

import java.util.HashMap;

public class OccurenceOfWordsiInAString {
	
	public static void main(String[] args) {
		String s ="Akshay Pawar QA Automation QA Akshay Pawar QA";
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for(String word:s.split(" ")) {
			hashmap.put(word, hashmap.getOrDefault(word, 0)+1);
		}
		
		System.out.println("Count of word's:"+hashmap);
	}

}
