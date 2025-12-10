package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionPredefinedInterface {

	public static void main(String[] args) {
       
		//Ex-1
		Function<String, Integer> lengthFilter = (str) -> str.length();
		System.out.println(lengthFilter.apply("Automation"));
        
		//Ex-2
		Function<Integer, Integer> f = n -> n * n;
		System.out.println(f.apply(10));
	

	}

}

