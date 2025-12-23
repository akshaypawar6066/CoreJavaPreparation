package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDeno1_Practice {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,20,30,40,50);
		
		List<Integer> squareNumbers =new ArrayList<>();
		
		//Find squares of numbers.
		
		squareNumbers=numbers.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println(squareNumbers);
		
		System.out.println("--------------------------------");
		
		
		//Just to priint
		numbers.stream().map(number->number*number).forEach(num->System.out.println(num));
	}

}


