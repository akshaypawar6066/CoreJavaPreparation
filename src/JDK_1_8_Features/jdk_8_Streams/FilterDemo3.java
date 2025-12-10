package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
	
	public static void main(String[] args) {
		List<String> data =new ArrayList<String>(Arrays.asList("Akshay", "Rohini", "Amol", null, "Urmila"));
		
		List<String> validData =new ArrayList<String>();
		
		validData=data.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(validData);

	}

}
