package Day07_String_Practice;

public class OccurenceOfCharacters {
	
	public static void main(String[] args) {
		String s ="Pune is a financial Hub";
		
		s=s.toLowerCase();
		
		int originalLength=s.length();
		int reducedLength= s.replace("a", "").length();
		System.out.println("Occurence of 'a' is:"+(originalLength-reducedLength));
		
	}

}
