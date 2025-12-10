package DAy06_Array_In_Java;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String s[] = {"Akshay", "akshay", "Bhagwan", "Pawar", "Test", "Name", "Arr"};
		System.out.println("Before sorting:"+Arrays.toString(s));
		
		Arrays.sort(s);  //To sort any type of array--->Ascendng sort.
		System.out.println("After Sorting:"+Arrays.toString(s));
	}

}
