package JDK_1_8_Features.jdk_8_Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {

		Set<String> vehicles = new HashSet<String>(Arrays.asList("bus", "car", "bicycle", "flight", "train"));
		// Convert all names into uppercase and store it in some other collection.
		Set<String> upperCase = new HashSet<String>();

		// Traditional Way
		/*
		 * for(String vehicle : vehicles) { upperCase.add(vehicle.toUpperCase()); }
		 * System.out.println(upperCase);
		 */

		// Using Streams.
		upperCase = vehicles.stream().map(str -> str.toUpperCase()).collect(Collectors.toSet());
		System.out.println(upperCase);

		System.out.println("--------------------------------------");

		// Just to ptint--->
		vehicles.stream().map(str -> str.toUpperCase()).forEach(str->System.out.println(str));

		System.out.println("--------------------------------------");

		// Just to ptint--->
		vehicles.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
	}
}
