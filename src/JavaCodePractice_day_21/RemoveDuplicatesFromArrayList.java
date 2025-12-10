package JavaCodePractice_day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>(Arrays.asList("Akshay", "Pawar", "QA", "Engineer", "Akshay"));
		
		System.out.println("Before removing duplictaes:"+myList);
		
		Set<String> hs = new LinkedHashSet<>(myList);
		System.out.println("Unique List is:"+myList);
		System.out.println("Unique List is:"+hs);
	}

}
