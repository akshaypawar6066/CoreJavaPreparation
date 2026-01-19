package CodePractice.Strings;

public class ReverseEachWordInAString {
	public static void main(String[] args) {
		String s ="Java is a Programming Language";
		
		String words [] =s.split(" ");
		String result="";
		
		
		for(String word:words) {
			String rev="";
			for(int i=word.length()-1; i>=0;i--) {
				rev=rev+word.charAt(i);
			}
			result=result+rev+" ";
		}
		
		System.out.println(result.trim());
		
		
		
		
	}

}
