package CodePractice.Strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfAllCHaracters {
	
public static void main(String[] args) {
		
		String s = "I Love My India iiii ssss mm";
		s=s.toLowerCase();
		char [] arr = s.toCharArray();
		HashMap<Character, Integer> charCount = new  HashMap<Character, Integer>();
		
		for(char ch : arr) {
			if(ch>='a' && ch<='z') {
				charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry:charCount.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		
		}
		
		
		
		
		
	}

}
