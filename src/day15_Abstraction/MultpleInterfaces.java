package day15_Abstraction;

interface Engine {
	void start();    // abstract method
	
	
	default void service() {         // Default method
		 System.out.println("Engine needs servicing every 6 months.");
	}
	
	static void fuelType() {
		System.out.println("Engines usually run on Petrol/Diesel/Electric.");
	}
	
}

interface MusicSystem {
	void playMusic();    //Abstarct method
	
	default void bluetoothConnect() {
        System.out.println("Music system connected via Bluetooth.");
	}
	
	static void musicType() {
		System.out.println("Music type:Bash");
	}
}

class CarSystem implements Engine, MusicSystem {
	
	@Override
	public void start() {
		 System.out.println("Car engine started.");
	}
	
	@Override
	public void playMusic() {
		  System.out.println("Playing music in car.");
	}
	
}

public class MultpleInterfaces {
	public static void main(String[] args) {
		CarSystem c = new CarSystem();
		c.start();
		c.service();
		Engine.fuelType();
		
		
		c.playMusic();
		c.bluetoothConnect();
		MusicSystem.musicType();
		
		
		
	}
}
