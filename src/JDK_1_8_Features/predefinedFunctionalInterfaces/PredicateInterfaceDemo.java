package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {
	public static void main(String[] args) {
		
		/*
		//Predicate(I)--->Accept only one argument.
		//We can use it when we have conditional checks in our program.
		
		//Ex-1
		Predicate<Integer> p=n-> n>10;
		
		System.out.println(p.test(15));
		System.out.println(p.test(5));
		System.out.println("-------------------------------------");
		
		//Ex-2
		Predicate<String> q=n-> n.length()>0;
		
		System.out.println(q.test("Akshay"));
		System.out.println(q.test(""));
		
		System.out.println("-------------------------------------");
		
		//Ex-3  -->Print array lememnts whose size is >4
		
		String arr [] = {"Akshay","Pawar", "PQR", "XYZ", "Rohini", "Pawar"};
		
		Predicate<String> str = (s) -> s.length()>4;
		
		
		for(String value: arr) {
			
			if(str.test(value)) {
				System.out.println(value);
			}
		}
		
		*/
		
	}

}
