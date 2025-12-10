package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods3 {
	public static void main(String[] args) {
		//reduce() ->To reduce all elemnts into a single stream/Single element.
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		Optional<Integer> sumData=numbers.stream().reduce((value, sum)->value+sum);
		System.out.println(sumData.get());
	}

}
