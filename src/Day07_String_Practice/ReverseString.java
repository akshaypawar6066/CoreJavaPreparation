package Day07_String_Practice;

public class ReverseString {
	
	public static void main(String[] args) {
		/*
		String s ="Data";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		
		System.out.println("Reverse String is:"+rev);
		*/
		//Approach 2
		/*
		String s ="Rohini";
		String rev="";
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			rev = rev+ch[i];
			
		}
		System.out.println("Reverse String is:"+rev);
		*/
		/*
		//Approach 3
		StringBuffer s = new StringBuffer("Welcome");
		System.out.println(s);
		System.out.println("Reversed String:"+s.reverse());
		
		*/
		//Approach 4
		
		StringBuilder s = new StringBuilder("Welcome");
		System.out.println(s);
		s.append(" Akshay");
		System.out.println(s);
		System.out.println("Reversed String:"+s.reverse());
		System.out.println();
		
		String s1 = new String("Welcome");
		System.out.println(s1);
		s1.concat(" Akshay");
		System.out.println(s1);

		
		
	}
}
 
