package Day07_StringClass;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String[] args) {
		String s1 ="akshay";
		String s2="Pawar";
		
		//Equals
		System.out.println(s1.equals(s2));  
		
		//equalsIgnoresCase
		System.out.println(s1.equalsIgnoreCase(s2));  
		
		//toUpperCase
		System.out.println(s1.toUpperCase());
		
		//toLowerCase
		System.out.println(s1.toLowerCase());;
		 String a="Akshay Pawar";
		
		//length
		System.out.println(a.length());
		
		//concat
		System.out.println(s1.concat(s2));
		
		//charAt()
		System.out.println(s1.charAt(2));
		
		//indexOf
		System.out.println(s1.indexOf("a"));
		
		//lastIndexOf()
		System.out.println(s1.lastIndexOf("a"));
		
		//substring(index)		
		String s ="I love My India";
		System.out.println(s.substring(5));
		
		//substrng(ndex, index)
		System.out.println(s.substring(5,11));
		
		//split()
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr));

		
		//isEmpty()
		System.out.println(s.isEmpty());
		
		//toCharArray()
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		//startsWith(prefx)  and endsWith(sufix)
		System.out.println(s.startsWith("I"));
		System.out.println(s.endsWith("india"));
		
		//replace(old char, new char)
		System.out.println(s.replace("I", "WE"));
		
		//replaceFirst()
		System.out.println(s.replaceFirst("I", "We"));
		
		//replaceAll()
		System.out.println(s.replaceAll("\\s", "-"));
	    System.out.println(s.replaceAll("[a-z]", "*"));;
		String str="I Love My 123India";
		System.out.println(str.replaceAll("\\d", "#"));
		
		//trim()
		String str1="  I Love My Inda  ";
		System.out.println(str1);
		System.out.println(str1.trim());
		
		
		String s3= new String("Akshay");
		String s4= new String("Akshay");
		
		System.out.println(s3==s4);
		
		String s5= "Akshay";
		String s6= "Akshay";
		System.out.println(s5==s6);
		
		
		String a1="Welcome";
		
		String a2="Wez";
		System.out.println(a1.contains(a2));
		
		System.out.println(a1.replace('c', 'X'));
		
		String k ="abc@gmail.com@123";
		String arrr[]=k.split("@");
		System.out.println(Arrays.toString(arrr));
		System.out.println(arrr[1]);
		
		
		String amount="$10,20,30";
		int amount_value= Integer.parseInt(amount.replace("$", "").replace(",", ""));
		System.out.println(amount_value);
		System.out.println("Discount is:"+(amount_value+10));
		
		String st= "abc,123@xyz"; //abc  123   xyz
		
		String array[]=st.split(",");
	    String array1[]=	array[1].split("@");

		System.out.println(array[0]+" "+array1[0]+" "+array1[1]);
		
		
		String name ="John kenedy";
		System.out.println(name.replace("J", "j").contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
		
		
	}

}
