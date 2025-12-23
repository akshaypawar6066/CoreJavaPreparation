package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionIntefaceDemoCLass {
	
	public static void main(String[] args) {
		Function<String, Integer> lenthCalculator = str->str.length();
		
		System.out.println(lenthCalculator.apply("Akshay"));
	}

}
