package CodePractice.Strings;

public class RemoveWhitespaces {
	public static void main(String[] args) {
		String s= "  Wel  Come  ";
		System.out.println(s.trim());
		
		s=s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
