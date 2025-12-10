package JDK_1_8_Features;

 interface testInterface {
	 
	
	
	default void defaultMethod() {
		System.out.println("Defaault method:");
	}
	
	static void staticMethod() {
		System.out.println("Static method:");
	}

}


public  class DefaultAndStaticMethodDemo implements  testInterface{
	
	 //Default and static method of Interface--->Introduced in jdk 1.8
	
	static void staticMethod() {            //separate method of implementation class--->static method of interface can not inheriiate in implementtaion class.
		System.out.println("Same Static method:from Implementation class:");
	}

	public static void main(String[] args) {
		
		DefaultAndStaticMethodDemo m = new DefaultAndStaticMethodDemo();
		m.defaultMethod();
		testInterface.staticMethod();
		DefaultAndStaticMethodDemo.staticMethod();
	}
}
