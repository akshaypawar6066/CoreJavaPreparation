package CodePractice.Strings;

public class OccurenceOfACharacterInSTring {
	public static void main(String[] args) {
		
		String s ="I Love my India iii ";
		s=s.toLowerCase();
		
		int count=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)>='a' &&  s.charAt(i)<='z') {
				if(s.charAt(i)=='i') {
					count++;
				}
				
			}
		}
		
		System.out.println("Occurence of character i is:"+count);
		
	}

}
