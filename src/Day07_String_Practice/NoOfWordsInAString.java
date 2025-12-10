package Day07_String_Practice;

public class NoOfWordsInAString {
	
	public static void main(String[] args) {
		String s="Mumbai is a financial hub";
		String [] arr=s.split(" ");
		System.out.println("Noof words In a String are:"+arr.length);
	}

}
