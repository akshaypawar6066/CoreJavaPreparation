package CodePractice.Strings;

public class ReverseEachWordInAStringUsingStringBuilder {
	public static void main(String[] args) {
		String s ="Java is a Programming Language";
		
		StringBuilder result = new StringBuilder();

		
		String [] words = s.split(" ");
		
		for(String word:words) {
			result.append(new StringBuilder(word).reverse().append(" "));
		}
		
		System.out.println(result);
		
	}

}
