package day11_MethodsAndConstrctor;

public class StudentMain {

	public static void main(String[] args) {
		
		
		//1.Assign data to the Student class Variables through Object Reference.
	  /*
	   Student s1 = new Student();
		s1.sId=101;
		s1="Akshay";
		s1.sGrade='A';
		
		s1.displayStudentData();
		
		*/
		
		/*
		
		//2.Assign data to the Student class VAriables through the Construcor.
		
		Student s2 = new Student(102, "Amol",'A');
		s2.displayStudentData();
		
		*/
		
		//3.Through the mrthods.
		Student s3 = new Student();
		s3.setUpData(103, "Suraj", 'O');
		s3.displayStudentData();
		
	}

}
