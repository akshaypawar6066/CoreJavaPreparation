package JDK_1_8_Features.predefinedFunctionalInterfaces;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierInterface {
	
public static void main(String[] args) {
	Supplier<Integer> randomNumberGenarator = () ->(int) (Math.random()*100);
	
	System.out.println("Generated Random Integer Is:"+randomNumberGenarator.get());
	
	Supplier<UUID> randomUUDGenerator =  () -> UUID.randomUUID();
		
	System.out.println("Generated UUUID:1"+randomUUDGenerator.get());
	System.out.println("Generated UUUID:2"+randomUUDGenerator.get());
	System.out.println("Generated UUUID:3"+randomUUDGenerator.get());

}

}
