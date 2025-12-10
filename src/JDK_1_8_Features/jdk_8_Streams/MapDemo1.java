package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		List<Integer> numberSquares = new ArrayList<Integer>();
		
		
		numberSquares=numbers.stream().map(n-> n*n).collect(Collectors.toList());
		System.out.println(numberSquares);
		System.out.println(numbers);

	}

}
