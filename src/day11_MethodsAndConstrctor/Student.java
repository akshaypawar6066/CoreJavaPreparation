package day11_MethodsAndConstrctor;

public class Student {
	
	int sId;
	String sName;
	char sGrade;
	
	

	
	public Student(int a) {
		
	}
	
	public Student() {
		
	}
	
	//1.Assign values through the Object reference.
	/*
	void displayStudentData() {
		System.out.println("sId:"+sId+" sName:"+sName+" SGarde:"+sGrade);
	}
	
	*/
	
	/*
	//2.Assign Values through the Constrctor
	
	
	public Student(int studentId, String StudentName, char StudentGrade) {
		this.sId=studentId;
		this.sName=StudentName;
		this.sGrade=StudentGrade;
		
	}
	
	void displayStudentData() {
		System.out.println("sId:"+sId+" sName:"+sName+" SGarde:"+sGrade);
	}
	*/
	
	//3.Through the method
	
	
	void setUpData(int sId, String name, char grade) {
		this.sId=sId;
		this.sName=name;
		this.sGrade=grade;
	}
	
	
	void displayStudentData() {
		System.out.println("sId:"+sId+" sName:"+sName+" SGarde:"+sGrade);
	}


}
