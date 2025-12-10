package Day07_String_Practice;

public class RemoveWhiteSpacesInAString {
	
	public static void main(String[] args) {
		
		//Apparoch1
		/*
		String s ="We l c  ome";
		String expectedStrng = "";
		
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				expectedStrng= expectedStrng+ch;
			}

		}
		*/
		
		//Apparoch2
		String s ="We l c  ome";
		String expectedString = s.replaceAll("\\s", "");  
		System.out.println("Expected String is:" + expectedString);

	}

}
