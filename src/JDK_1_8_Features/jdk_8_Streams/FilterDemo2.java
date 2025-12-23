package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("Rohini", "Akshay", "Dhananjay", "Joffery"));
		List<String> longNames = new ArrayList<String>();

		longNames = names.stream().filter(s -> s.length() >= 6 && s.length() < 8).collect(Collectors.toList());
		System.out.println(longNames);
		System.out.println("--------------------------------------------------------");

		// just print
		names.stream().filter(s -> s.length() >= 6 && s.length() < 8).forEach(s -> System.out.println(s));
		System.out.println("--------------------------------------------------------");

		// just print -->Through method reference
		names.stream().filter(s -> s.length() >= 6 && s.length() < 8).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------");
		List<String>veryLongNames=names.stream().filter(str->str.length()>=8 && str.length()<10).collect(Collectors.toList());
		System.out.println(veryLongNames);
		
		//Just to print
		names.stream().filter(str->str.length()>=8 && str.length()<10).forEach(n-> System.out.println(n));
		
		

	}

}
