package CodePractice.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingSetAndStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Akshay", "Java", "Python", "Akshay", "Java", null, null));
	
		
		Set<String> seen = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		List<String> nonNull = new ArrayList<>();
		
		List<String> uniqueList=list.stream().filter(str->seen.add(str)).collect(Collectors.toList());
		System.out.println("Unique list is:"+uniqueList);
		
		List<String> duplicateElememntList=list.stream().filter(str->!duplicates.add(str)).collect(Collectors.toList());
		System.out.println("Duplicate elements list:"+duplicateElememntList);
		
		List<String> distinctAndNonNullList=list.stream().distinct().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("Distinct and Non null list is:"+distinctAndNonNullList);
		
       
		
		
		
	}

}
