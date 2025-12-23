package CodePractice.Strings;

public class ReverestringUsingStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Akshay");
		sb.reverse();
		System.out.println(sb);
		
		
		StringBuffer s=new StringBuffer("Akshay");
		String rev="";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
