package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMethod2 {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		//Find count of even numbers.
		
		long evenNumberCount=numberList.stream().filter(n->n%2==0).count();
		System.out.println("Even Numbers count is:"+evenNumberCount);
		
		//max() ->Find maximum number
		int maxNumber=numberList.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maximum Number is:"+maxNumber);
		
		//Find minimum number
		//int minNumber=numberList.stream().min(Comparator.naturalOrder()).get();   OR
		//System.out.println("Minimun Number is:"+minNumber);
		
		Optional<Integer> minValue=numberList.stream().min((val1, val2)-> val1.compareTo(val2));
		int minNumber =minValue.get();
		System.out.println("Minimun Number is:"+minNumber);
		
	}

}
