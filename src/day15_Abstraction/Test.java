package day15_Abstraction;

abstract class Animal {
	static int a=10;
	int b=100;
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }
}

public class Test {
    public static void main(String[] args) {
        new Dog();
    }
}
