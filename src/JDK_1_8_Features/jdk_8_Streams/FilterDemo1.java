package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 15, 20, 25, 30));
		
		List<Integer> evenNumbers = new ArrayList<Integer> ();
		
		//Traditional way to find even No and store it in some other list
		/*
		for(int num : numbers) {
		
			if(num%2==0) {
				evenNumbers.add(num);
			}
		}
		
		System.out.println(evenNumbers);
		*/
		
		//Using stream(), find even No and store it in some other list
		evenNumbers=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		System.out.println("--------------------------------------------------------");
		
		//After filtering data If you want to print it.
		numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		System.out.println("--------------------------------------------------------");
		
		//We can use method reference as well.
		numbers.stream().filter(n->n%2==0).forEach(System.out :: println);

	}

}
