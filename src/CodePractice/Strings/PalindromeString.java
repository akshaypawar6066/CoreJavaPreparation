package CodePractice.Strings;

public class PalindromeString {
	public static void main(String[] args) {
		
		String s= "mam";
		 String rev="";
		 
		 for(int i=s.length()-1; i>=0; i--) {
			 rev=rev+s.charAt(i);
		 }
		 
		 if(rev.equals(s)) 
			 System.out.println("Entered String is Palindrome string");
		 else 
			 System.out.println("Entered String is not a palindrome.");
	}

}
