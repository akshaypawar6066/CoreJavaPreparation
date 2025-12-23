package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1_Practice {
	
public static void main(String[] args) {
	//Problem statement--> Find even numbers from list and add it in another list.
	
	
	//1.Traditinal way
	/*
	List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,25,30,45,24,48));
	List<Integer>evenNoList = new ArrayList<>();
	
	
	for(Integer number:numbers) {
		if(number%2==0) {
			evenNoList.add(number);
		}
	}
	
	System.out.println("Original List:"+numbers);
	System.out.println("Even Numbers Lits:"+evenNoList);
	
	*/
	
	List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,25,30,45,24,48));
	List<Integer>evenNoList = new ArrayList<>();
	
	//2.Using Stream API.
	
	evenNoList=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
	
	System.out.println("Original List:"+numbers);
	System.out.println("Even Numbers Lits:"+evenNoList);
	System.out.println("--------------------------------------------------------");
	
	
	//After filtering data If you want to print it.
	numbers.stream().filter(number->number%2==0).forEach(n->System.out.println(n));
	System.out.println("--------------------------------------------------------");
	
	//We can use method reference as well.
	numbers.stream().filter(number->number%2==0).forEach(System.out::println);
}

}
