package CodePractice.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("Akshay", "Java", "Python", "Akshay", "Java", null, null));
		
		/*
		 //Using Set -->Dosent allowduplicates.
		Set<String> hashSet = new LinkedHashSet<String>(list);
		List<String> result = new ArrayList<>(hashSet);
		System.out.println("Unique list is:"+result);
		*/
		
		//Using Java 8 Stream
		/*
		List<String> uniquesList=list.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique list elements are:"+uniquesList);
		*/
		
		//Using pure logic
		List<String> uniqueList = new ArrayList<>();
		List<String> duplicateList = new ArrayList<>();
		
		for(String s:list) {
			if(!uniqueList.contains(s)) {
				uniqueList.add(s);
			}
			else {
				if(!duplicateList.contains(s)) {
					duplicateList.add(s);
				}
			}
		}
		
		System.out.println("Unique elements are:"+uniqueList);
		System.out.println("Duplicate elements are:"+duplicateList);
		
	}

}
