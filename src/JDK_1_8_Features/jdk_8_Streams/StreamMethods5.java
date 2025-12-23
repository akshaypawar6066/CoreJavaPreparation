package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods5 {

	public static void main(String[] args) {
		/*
		 * 
		 * List<Integer> numbers = new
		 * ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,8,97,75));
		 * 
		 * List<Integer> sortedList =
		 * numbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList(
		 * )); System.out.println("Ascending order list:"+sortedList);
		 * 
		 * System.out.println("----------------------------");
		 * 
		 * List<Integer> descendingSortedList =
		 * numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList(
		 * )); System.out.println("Descending order list:"+descendingSortedList);
		 * 
		 * //Sort String
		 * 
		 * 
		 * List<String> names = new ArrayList<String>(Arrays.asList("Akshay", "Amol",
		 * "Rohini", "Urmila","Aniket"));
		 * 
		 * List<String>
		 * stringSortedList=names.stream().sorted(Comparator.naturalOrder()).collect(
		 * Collectors.toList()); System.out.println(stringSortedList); //Ascending
		 * 
		 * 
		 * List<String>
		 * stringDescendingSortedList=names.stream().sorted(Comparator.reverseOrder()).
		 * collect(Collectors.toList()); System.out.println(stringDescendingSortedList);
		 * 
		 */

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 10, 8, 97, 75));

		// anyMatch(), allMatch(), noneMatch().
		// 1.anyMAtch()
		boolean result1 = numbers.stream().anyMatch(n -> n > 80); // true
		boolean result2 = numbers.stream().anyMatch(n -> n > 100); // false

		System.out.println(result1);
		System.out.println(result2);

		System.out.println("---------------");

		// 2.allMAtch()
		System.out.println(numbers.stream().allMatch(n -> n > 0)); // true
		System.out.println(numbers.stream().allMatch(n -> n > 10)); // false
		

		System.out.println("---------------");

		// 3.noneMatch()
		System.out.println(numbers.stream().noneMatch(n -> n > 10)); // false
		System.out.println(numbers.stream().noneMatch(n -> n > 500));

		System.out.println("---------------");

		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango", "Banana"));
		System.out.println(fruits.stream().anyMatch(fruit -> fruit.startsWith("APP")));

		System.out.println(fruits.stream().anyMatch(fruit -> {
			return fruit.startsWith("Ba");
		}));

		System.out.println(numbers.stream().findAny().get());   //With sequentiial stream it will return first elemnt but in parallel Stream it will retruyn any element which is faster processed.
		System.out.println(numbers.stream().findFirst().get());
		
		
		System.out.println("---------------");
		
		//Concatanation of Stream.
    
		List<String> animalList = new ArrayList<String>(Arrays.asList("Dog", "Cat", "Beffallo"));
		List<String> birdList = new ArrayList<String>(Arrays.asList("Peacock", "Parrot", "Hen"));
		
		Stream<String> stream1=animalList.stream();
		Stream<String> stream2=birdList.stream();
		
		List<String> concanatedList=Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(concanatedList);
		
		List<String> trees= new ArrayList<String>(Arrays.asList("Babul", "Limmb", "Banana"));
		List<String> flowersList = new ArrayList<String>(Arrays.asList("Zendu", "Gulab", "Mogara"));
		
		Stream<String> s1=trees.stream();
		Stream<String> s2=flowersList.stream();
		
		List<String> concanated=Stream.concat(s1, s2).collect(Collectors.toList());
		
		System.out.println("Conncanated liat is:"+concanated);

		
		

		
	}

}
