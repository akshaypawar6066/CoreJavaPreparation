package day20_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoColllections {
	
	public static void main(String[] args) {
		// Converting between List and Set:

		// 1️⃣  List ➜ Set  (removes duplicates)
		List<String> list = new ArrayList<>();
		list.add("Akshay");
		list.add("Pawar");
		list.add("Akshay");
		System.out.println("Normal List:"+list);// duplicate
		Set<String> setFromList = new HashSet<String>(list); // List to Set
		System.out.println("Set from List: " + setFromList);

		// 2️⃣  Set ➜ List  (preserves current Set iteration order)
		Set<String> set = new HashSet<>();
		set.add("Morningstar");
		set.add("QA");
		List<String> listFromSet = new ArrayList<>(set); // Set to List
		System.out.println("List from Set: " + listFromSet);
		
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(101, "Akshay");
		m1.put(102, "Akshay");
		
		System.out.println("Map Printing ways:");
		System.out.println("------------------");
		
		//Map printing ways.
		//1.Direct way
		System.out.println(m1);
		
		System.out.println("------------------");
		
		//2.Using entrySet
		System.out.println(m1.entrySet());
		
		System.out.println("------------------");

		//3.Using for each loop
		for(Integer key:m1.keySet()) {
			System.out.println(key+":"+m1.get(key));
		}
		
		System.out.println("------------------");

		//4 for loop with entrySet
		  Set<Map.Entry<Integer, String>> entries= m1.entrySet();
		  for(Map.Entry<Integer, String> entry:entries) {
			  System.out.println(entry);
		  }
		  
			System.out.println("------------------");

			//5 for loop with entrySet and It's methods
		  for(Map.Entry<Integer, String> entry:entries) {
			  System.out.println(entry.getKey()+"===>"+entry.getValue());
		  }

		
		
	}

}
