package day_13_This_Super_Static_Fina_Keywords;

public class Student {
	
	//Uses of this keyword
	
	int age;
	String name;
	
	
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public  void dsplay() {
		System.out.println("Student Name Is:"+name+ " and Student age Is:"+age);
	}
	
	public static void main(String[] args) {
		Student s1= new Student(25, "Akshay");
		s1.dsplay();
	}
	

}
