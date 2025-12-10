package Day07_String_Practice;

public class RemoveSpecialCharacters {
	
	public static void main(String[] args) {
		String s="gfad@##$hsf*^";
		String expectedString="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				expectedString=expectedString+ch;
			}
		}
		System.out.println("Expected String is:"+expectedString);
	}

}
