package day_12__EncpasulationDemo;

public class EncapsulationMainClass {
	
	public static void main(String[] args) {
		Student s1= new Student();
		
		s1.setName("Akshay");
		System.out.println("Name of student is:"+s1.getName());
		
		s1.setAge(28);
		System.out.println("Age of student is:"+s1.getAge());
	}

}
