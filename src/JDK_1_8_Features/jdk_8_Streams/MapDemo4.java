package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo4 {
	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(2,3,4,5));
		List<Integer> cubeOfNumbers = new ArrayList<Integer>();
		
		//Find cube of all the elemnts from the list and store it in some other collection.
		cubeOfNumbers=numbersList.stream().map(n->n*n*n).collect(Collectors.toList());
		System.out.println(cubeOfNumbers);
		System.out.println(numbersList.stream().map(n->n*n*n).collect(Collectors.toList()));  //Without storing.
		
		System.out.println("_______________________________");
		
		//To Just print
		numbersList.stream().map(n->n*n*n).forEach(num->System.out.println(num));
		
		System.out.println("_______________________________");

		
		//To Just print ->Using Method refrence
		numbersList.stream().map(n->n*n*n).forEach(System.out::println);
	}

}
