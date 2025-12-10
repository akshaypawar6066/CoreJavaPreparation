package Day__CLass_Object;

public class EmpMainClass {

	public static void main(String[] args) {
		DemoClassAndObject d = new DemoClassAndObject();
		d.empId=101;
		d.empName="Akshay";
		d.empJob ="Senior QA Engineer";
		d.empSallery=110000;
		
		d.display();
		
        System.out.println();

		DemoClassAndObject d1 = new DemoClassAndObject();
		d1.empId=102;
		d1.empName="Amol";
		d1.empJob ="Boss";
		d1.empSallery=200000;
		
		d1.display();

	}

}
