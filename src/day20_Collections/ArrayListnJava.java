
package day20_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListnJava {

	public static void main(String[] args) {

		/*
		 * //Declartion
		 * 
		 * //ArrayList mylist = new ArrayList(); //List mylist = new ArrayList();
		 * //List<Object> mylist = new ArrayList<Object>();
		 * 
		 * //ArrayList<Integer> mylits = new ArrayList<Integer>(); --:To store
		 * Homogenous data //ArrayList<Employe> mylist = new ArrayList<Employe>();
		 * --->It will alllow to store employe type of Objects.
		 * 
		 * //How to declare the ArrayList and add values at a time? 
		 * ArrayList myList = new ArrayList<>(Arrays.asList("Akshay", "Pawar",101,8.25));
		 * 
		 * 
		 * 
		 * List l1 = new ArrayList<>();
		 * 
		 * l1.add(10); l1.add("Akshay"); l1.add(25.5); l1.add(true); l1.add("Akshay");
		 * l1.add(null); l1.add(null);
		 * 
		 * 
		 * 
		 * //For-Each loop for(Object e:l1) { System.out.println(e); }
		 * 
		 * System.out.println(); l1.set(5, "Pawar");
		 * 
		 * //For loop for(int i=0; i<l1.size(); i++) { System.out.println(l1.get(i)); }
		 * System.out.println();
		 * 
		 * 
		 * //Iterator
		 * 
		 * Iterator it = l1.iterator() ;
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 * 
		 * System.out.println("Size of list is:"+l1.size());
		 * 
		 */
		
		
		ArrayList l1 = new ArrayList();

		l1.add("QA");
		l1.add("Engineer");

		ArrayList myList = new ArrayList();

		myList.add("Akshay"); // add()
		myList.add(1, "Pawar"); // add(int, E)
		myList.addAll(l1); // addAll(l1);

		System.out.println(myList);

		myList.remove(2); // remove(int)
		System.out.println(myList);

		myList.remove("Engineer"); // remove(E);
		System.out.println(myList);

		myList.addAll(l1);
		System.out.println(myList);

		myList.removeAll(l1); // removeAll(l1)
		System.out.println(myList);
		

		System.out.println("<-------------------------->");

		System.out.println(myList.indexOf("Akshay")); // indexOf(object)
		System.out.println(myList.lastIndexOf("Pawar")); // lastIndexOf(object)

		System.out.println("Size of arrayList is:" + myList.size()); // Size()
		System.out.println(myList.isEmpty()); // isEMpty()

		System.out.println(myList.contains("Pawar")); // contains()

		System.out.println(myList.get(0)); // get()
		myList.set(0, "AK"); // set(i, E)

		System.out.println(myList);

		System.out.println("----------------------");
		myList.clear(); // clear()

		System.out.println(myList);

		System.out.println("----------------------");

		myList.add("Don");
		myList.addAll(l1);

		System.out.println("Printing elements through iterator:");
		Iterator it = myList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList a = new ArrayList<>();
		a.addAll(Arrays.asList("Akshay", 10, 25.5)); // TO add multiple elemnts at a time.
		System.out.println(a);
		System.out.println(a.indexOf("Test"));   //Return -1 if Specifiied Object is not present in the ArrayList.

	}

}
