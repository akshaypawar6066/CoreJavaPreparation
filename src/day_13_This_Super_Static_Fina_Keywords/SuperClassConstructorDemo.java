package day_13_This_Super_Static_Fina_Keywords;

class Person {

	public Person(String nameOfPerson) {
		System.out.println("Person constructor called:" + " Name of Person Is:" + nameOfPerson);
	}

}

class Employe extends Person {
	public Employe(String employeName) {
		super("Akshay");
		System.out.println("Employee constructor called:" + " name of the employe is:" + employeName);
	}
}

public class SuperClassConstructorDemo {
	public static void main(String[] args) {
		Employe e1 = new Employe("Amol");
	}

}
