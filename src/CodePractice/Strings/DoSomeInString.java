package CodePractice.Strings;

public class DoSomeInString {
	public static void main(String[] args) {
		String s ="Aksh23445342522#$#@$%fhgh556";
		
		String numeric="";
		String alphabetic="";
		String specialCharacters="";
		int sum=0;
		
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				alphabetic = alphabetic+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i))) {
				numeric = numeric+s.charAt(i);
				sum= sum+ Character.getNumericValue(s.charAt(i));
			}
			else {
				specialCharacters =specialCharacters +s.charAt(i);			}
		}
		
		System.out.println(String.format("Alphabetics in a string are: %s", alphabetic));
		System.out.println(String.format("Special characters in a String are in a string are: %s", specialCharacters));
		System.out.println(String.format("Digits in a string are : %s", numeric));
		
		System.out.println(String.format("Sum of digits in a string are :%d", sum));
		
		
	}

}
