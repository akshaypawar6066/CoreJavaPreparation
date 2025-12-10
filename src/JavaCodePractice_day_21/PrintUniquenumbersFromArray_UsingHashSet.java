package JavaCodePractice_day_21;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniquenumbersFromArray_UsingHashSet {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 10, 50, 60, 50, 50};
        
      
        Set<Integer> unique = new LinkedHashSet<Integer>();
        
        for(int a:numbers) {
        	unique.add(a);
        }
        System.out.println("Unique elemnst are:"+unique);

	}

}
