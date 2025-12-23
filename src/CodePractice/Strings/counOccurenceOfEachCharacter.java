package CodePractice.Strings;

import java.util.HashMap;
import java.util.Map;

public class counOccurenceOfEachCharacter {
	public static void main(String[] args) {
		String s ="I Love My India";
		s=s.toLowerCase();
		
		char[] charArrray=s.toCharArray();
		
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		
		for(char ch:charArrray) {
			if(ch==' ') continue;
		  charCount.put(ch, charCount.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:charCount.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
