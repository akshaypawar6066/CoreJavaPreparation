package JavaCodePractice_day_21;

public class CountOccurenceOfSpecificCharacter {
	
	public static void main(String[] args) {
		String s ="Rohini";
		s= s.toLowerCase();
		
		int originalSize = s.length();
		s=s.replace("o", "");
		int reducedSize= s.length();
		
		System.out.println("Occurence of character 'o' is:"+(originalSize-reducedSize) );
	}

}
