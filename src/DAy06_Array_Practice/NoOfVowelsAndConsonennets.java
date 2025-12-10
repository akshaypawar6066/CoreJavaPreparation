package DAy06_Array_Practice;

public class NoOfVowelsAndConsonennets {
	
	public static void main(String[] args) {
		String s ="I Love My India Kyu123";
		int vowelsCount=0,consonentsCOunt=0;
		
		s=s.toUpperCase();
		
		for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				if(ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U' ) {
					vowelsCount++;
				}
				else
				{
					consonentsCOunt++;
				}
			}
		}
		
		System.out.println("Vowels COunt:"+vowelsCount+" and Consonents COunt:"+consonentsCOunt);
		
		
		
	}

}
