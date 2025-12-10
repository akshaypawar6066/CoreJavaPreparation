package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo2 {
	
	public static void main(String[] args) {
		Consumer<String> c1= s->System.out.println(s+" is a white");
		Consumer<String> c2= s->System.out.println(s+" Has a four legs");
		Consumer<String> c3= s->System.out.println(s+" is earing grass");
		
		/*
		c1.accept("Cow");
		c2.accept("Cow");
		c3.accept("Cow");
		*/
		
		//Consumer chaining
		//c1.andThen(c2).andThen(c3).accept("Cow");   //Or
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Cow");
	}

}
