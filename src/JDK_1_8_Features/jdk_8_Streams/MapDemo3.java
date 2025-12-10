package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	public static void main(String[] args) {
		List<String> vehicles = new ArrayList<String>(Arrays.asList("bus", "car", "bicycle", "flight", "train"));
		
		//Find length of each Element and stote it in some other collection.
		
		List<String> lengths = new ArrayList<String>();
		
		lengths=vehicles.stream().map(v->"Vehcicle Name:"+v.toUpperCase()+",Length Of Vehicle:"+v.length()).collect(Collectors.toList());
		System.out.println(lengths);
		
		System.out.println("--------------------------------------");

		
		//To just print
		vehicles.stream().map(v->v.length()).forEach(len->System.out.println(len));
		
		System.out.println("--------------------------------------");

		
		//To just print -->Using method reference
		vehicles.stream().map(v->v.length()).forEach(System.out::println);
		

		
	}

}
