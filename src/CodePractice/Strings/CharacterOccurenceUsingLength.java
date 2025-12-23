package CodePractice.Strings;

public class CharacterOccurenceUsingLength {
	
	public static void main(String[] args) {
		String s= "I Love My India iii";
		s=s.toLowerCase();
		
		int length= s.length()-s.replace("i", "").length();
		System.out.println("Occurence of character I is:"+length);
		
	}

}

