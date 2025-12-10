package Day07_String_Practice;

public class StringComparision {
	
	public static void main(String[] args) {
		//Scenario 1
		/*
		String s1="Welcome";
		String s2="Welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		//Scenario 2
		/*
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		/*
		 * 
		 * //Scenario 3
		String s1="Welcome";
		String s2=new String("Welcome");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		*/
		
		//Scenario 4
		
		String s1="Welcome";
		String s2=new String("Welcome");
		
		String s3=s2;
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s3));   //true
		System.out.println(s2==s3);   //true
		
	}

}
