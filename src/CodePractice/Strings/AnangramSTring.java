package CodePractice.Strings;

import java.util.Arrays;

public class AnangramSTring {
	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();

		char[] c = s1.toCharArray();
		char[] d = s2.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d)) {
			System.out.println("Given Strings are anangram strings:");
		}
		else
		{
			System.out.println("Given Strings are not anangram String:");
		}
		
		
	}

}
