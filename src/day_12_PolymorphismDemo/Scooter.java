package day_12_PolymorphismDemo;

class Car {
	void startWay() {
		System.out.println("Starting with Key:");
	}
}

public class Scooter extends Car{
	@Override
	  void startWay() {
		System.out.println("Starting with Kick:");
	}

}
