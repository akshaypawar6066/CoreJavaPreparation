package CodePractice.GeneralNumbers;

public class NumberOfVowelsAndConsonents {
	public static void main(String[] args) {
		String s = " I Love My India Akshay";
		s=s.toLowerCase();
		
		int vowelCount = 0, consonentCount=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z')  {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
					 vowelCount++;
				}
				else
				{
					consonentCount++;
				}
			}
			
			
		}
		
		System.out.println(String.format("Vowel count is:%d and Consonet count is:%d", vowelCount, consonentCount));
		
	}

}
