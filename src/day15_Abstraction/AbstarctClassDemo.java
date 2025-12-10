package day15_Abstraction;

abstract class Car {
	public abstract void drive(); // Incomplete method
	
	double milege;
	static int tyreZise;
	
	static {
		tyreZise=25;
	}

	public void topUFuep(String carName) { // Complete Method.
		System.out.println(carName + " Required Power fuel" +" Milege of a car is:"+milege+" Tyre size is:"+tyreZise);
	}
	
	public Car(double milege) {
		this.milege=milege;
	}
}

class Tesla extends Car {

  public Tesla(double milege) {
	  super(milege);
  }

	@Override
	public void drive() {
		
		System.out.println("Tesla Car can be Automatically driven.");
	}

}

public class AbstarctClassDemo {

	public static void main(String[] args) {
		Tesla t1 = new Tesla(12.5);
		t1.drive();
		t1.topUFuep("Tesla:");
	}
}
