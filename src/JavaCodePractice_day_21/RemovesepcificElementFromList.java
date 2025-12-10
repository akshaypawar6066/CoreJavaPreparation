package JavaCodePractice_day_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemovesepcificElementFromList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Pass", "Fail", "Skip"));
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			if(it.next().equalsIgnoreCase("Fail")) {
				it.remove();                //Wiill remove the underlying element.
			}
		}
		System.out.println("After removal:"+list);
		
		
		 
	}

}
