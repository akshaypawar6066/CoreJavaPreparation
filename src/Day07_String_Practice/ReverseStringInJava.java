package Day07_String_Practice;

public class ReverseStringInJava {
	
	public static void main(String[] args) {
		String s ="I Love my India";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reversed String is:"+rev);
	}

}
