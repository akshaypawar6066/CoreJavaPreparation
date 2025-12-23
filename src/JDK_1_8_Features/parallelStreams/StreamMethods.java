package JDK_1_8_Features.parallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,15,25,35,10,30));
		/*
		
		//Filter method to filter the data
		List<Integer>evenNo=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(evenNo);
		
		System.out.println("------------------------------------------------");
		
		//Just to print the even Numbers data
		numbers.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
		
		System.out.println("------------------------------------------------");
		//Just to print the  Numbers data
		numbers.stream().forEach(System.out::println);
		
		
		System.out.println("------------------------------------------------");
      
		//map function
		List<Integer> squares=numbers.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println(squares);
		
		System.out.println("------------------------------------------------");

		
		//Just to print the data
		numbers.stream().map(num->num*num).forEach(System.out::println);
		*/
		
		//Get  data
		
		numbers.stream().forEach(System.out::println);
		
		System.out.println("------------------------------------------------");

		//get distinct data
		numbers.stream().distinct().forEach(num->System.out.println(num));
		
		//Sort data in ascending
		System.out.println("------------------------------------------------");
		numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//Sort data in descending
		System.out.println("------------------------------------------------");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("------------------------------------------------");
        //skip method-->To skip first n records
		
		numbers.stream().skip(7).forEach(num->System.out.println(num));
		
		System.out.println("------------------------------------------------");
		//limit method-->Limit records to first n numbers.
		numbers.stream().limit(5).forEach(num->System.out.println(num));
		
		System.out.println("------------------------------------------------Records count");

		//Count the recors
		System.out.println(numbers.stream().distinct().count());
		
		//Minimum and maximum value
		System.out.println("-------------Minimum and maximum value");
		System.out.println("Minumum no is:"+numbers.stream().min(Comparator.naturalOrder()).get());
		System.out.println("Maximum number is:"+numbers.stream().max(Comparator.naturalOrder()).get());
		
		//Convert to array.
		Object[] arr=numbers.stream().toArray();
		System.out.println("Array elemnts are:"+Arrays.toString(arr));
		
		//For sequential stream
		
		System.out.println("-------------------Print findAny");
		System.out.println(numbers.stream().findAny().get());
		
		System.out.println("-------------------Print findFirst");
		System.out.println(numbers.stream().findFirst().get());
		System.out.println("-------");
		
		
	//For parallel stream
		
		System.out.println("-------------------Print findAny");
		System.out.println(numbers.parallelStream().findAny().get());
		
		System.out.println("-------------------Print findFirst");
		System.out.println(numbers.parallelStream().findFirst().get());
	}

}
