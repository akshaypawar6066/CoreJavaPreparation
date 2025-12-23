package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMethods4 {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,8,97,75));
		
		//toArray() --->To convert given stream into an array.
		
		Object a[]=numbers.stream().toArray();
		System.out.println(Arrays.toString(a));
		System.out.println("Array Length is:"+a.length);
		
       //sorted() 
		numbers.stream().sorted(Comparator.naturalOrder()).forEach(num->System.out.println(num));   //Sort in Ascending order
		System.out.println("-------------------------------");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);          //sort in descending oeder.
		
		System.out.println("-------------------------------");

	
	
		//skip() --->it will skip the number of leading elements.
		numbers.stream().skip(5).forEach(System.out::println);    //Terminal Operation we can directly used on Streams or after performing Non-Terminal Operations.
		//Non-Terminal Operations we need to perform on streams.
		System.out.println("-------------------------------");

		
		numbers.stream().forEach(System.out::println);
		
	}

}
