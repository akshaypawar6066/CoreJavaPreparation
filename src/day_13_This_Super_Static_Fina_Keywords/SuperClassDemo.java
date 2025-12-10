package day_13_This_Super_Static_Fina_Keywords;

class Animal {
	String Color="White";
	
	void eat() {
		System.out.println("Animal is eating:Non-Vegs");
	}
}

class Dog extends Animal {
	String Color="Black";

	void eat() {
		System.out.println("Dog is eating:Vegs");   //Currentc class method
		super.eat();  //Super class method.
	}
	
	
	void display() {
		System.out.println("Dog color is:"+this.Color);   //Current class
		System.out.println("Animal color is:"+super.Color);  //Parent class
	}
}

public class SuperClassDemo {
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.display();
		d1.eat();
	}
}
