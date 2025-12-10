package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {

		// distinct
		// count()
		// limit()

		List<String> vehicleList = new ArrayList<String>(
				Arrays.asList("bus", "car", "bycycle", "bus", "car", "car", "bike"));

		/*
		 * 
		 *
		 * //1.dstinct() -->To find unique elemnts from the list List<String>
		 * uniqueVehicles =
		 * vehicleList.stream().distinct().collect(Collectors.toList()); // dstict()
		 * -->To // find unique // elements System.out.println(uniqueVehicles);
		 * 
		 * System.out.println("-----------------------------------"); // Just to print
		 * vehicleList.stream().distinct().forEach(vehcicle ->
		 * System.out.println(vehcicle));
		 * 
		 * System.out.println("-----------------------------------");
		 * 
		 * // Just to print ->Using method reference
		 * vehicleList.stream().distinct().forEach(System.out::println);
		 */
		

		
		//2. count()  -->To count the Number of elemnets/Objects.
		long count=vehicleList.stream().distinct().count();
		System.out.println("Count of objects after distict is:"+count);
		
		//3. limit() -> to limit the data.
		List<String> limtedDataList=vehicleList.stream().limit(2).collect(Collectors.toList());
		System.out.println(limtedDataList);
		
		
	}

}
