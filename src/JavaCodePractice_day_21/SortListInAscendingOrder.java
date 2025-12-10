package JavaCodePractice_day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListInAscendingOrder {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,4,32,45));
		 
		 Collections.sort(list);
		 System.out.println("List in Ascending order is:"+list);
	}

}
