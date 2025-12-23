package CodePractice.Strings;

public class RemoveSpecialCHaracters {
public static void main(String[] args) {
	String s = "sdfg$#$#%dfgh";

	String expectedString = "";
	
	for(int i=0; i<s.length();i++) {
		if(Character.isAlphabetic(s.charAt(i))) {
			expectedString = expectedString+s.charAt(i);
		}
	}
	
	System.out.println("Expected String is:"+expectedString);
}

}
