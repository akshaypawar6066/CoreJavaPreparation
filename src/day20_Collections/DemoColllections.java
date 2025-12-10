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
		list.add("Akshay");            // duplicate
		Set<String> setFromList = new HashSet<String>(list); // List to Set
		System.out.println("Set from List: " + setFromList);

		// 2️⃣  Set ➜ List  (preserves current Set iteration order)
		Set<String> set = new HashSet<>();
		set.add("Morningstar");
		set.add("QA");
		List<String> listFromSet = new ArrayList<>(set); // Set to List
		System.out.println("List from Set: " + listFromSet);
		
		
		Map m = new HashMap<>();
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(101, "Akshay");
		m1.put(102, "Akshay");
		
		System.out.println(m1.entrySet());
		
		
		
	}

}
