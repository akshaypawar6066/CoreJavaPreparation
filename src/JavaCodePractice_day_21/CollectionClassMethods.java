package JavaCodePractice_day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionClassMethods {

	public static void main(String[] args) {

		// Sort list in Ascending
		List<Integer> myList = new ArrayList<>(Arrays.asList(10, 25, 8, 34, 45, 90,10,10,10,10));
		Collections.sort(myList);

		System.out.println("Sorteed list in Ascending order is:" + myList);

		// Sort list in Descending
		myList.sort(Collections.reverseOrder());
		System.out.println("Sort List in Descending Order is:" + myList);

		// Print list in reverse order.
		Collections.reverse(myList);
		System.out.println("List in Reverse order is:" + myList);

		// Find Maximum no from collection
		System.out.println("Maxiimum No is:" + Collections.max(myList));

		// Find Minumum no from collection
		
		System.out.println("Minumum No is:" + Collections.min(myList));
		
		System.out.println(Collections.frequency(myList, 10));
		

	}

}
