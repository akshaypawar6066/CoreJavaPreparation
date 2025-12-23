package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumnerInterfaceDemo {
	
	public static void main(String[] args) {
		Consumer<String> con = str -> System.out.println("Name:"+str);
		con.accept("Akshay");
		
		Consumer<Integer> con1 = i-> System.out.println(i*i);
		con1.accept(20);
	}

}
