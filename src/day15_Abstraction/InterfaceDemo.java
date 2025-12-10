package day15_Abstraction;

interface 	Vehicle {
	    void start(); // abstract method
	    void stop();  // abstract method

}

class Bike implements Vehicle {
	
	 public void start() {
	        System.out.println("Bike started");

	  }
	  
	 public void stop() {
	        System.out.println("Bike stopped");

	  }
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	Bike b1 = new Bike();
	b1.start();
	b1.stop();
}
}
