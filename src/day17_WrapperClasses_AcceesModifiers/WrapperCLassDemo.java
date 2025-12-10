package day17_WrapperClasses_AcceesModifiers;

public class WrapperCLassDemo {
	
	public static void main(String[] args) {
		/*
		String s ="10";
		System.out.println(s+10);
		int num1 = Integer.parseInt(s);
	    System.out.println(num1+10);
	    
	    double d=Double.parseDouble("3.14");
	    System.out.println(d+10);
	    
	    
	    int num=101;
	    String s1= String.valueOf(num);
	    System.out.println("My role num is:"+s1);
	    System.out.println(s1+10);
	    System.out.println(num+10);
	    */

		
		//Convert Premitve data type into String
		boolean falg=true;
		String data=String.valueOf(falg);
		System.out.println(data);
		
		int x=101;
		String x1=String.valueOf(x);
		System.out.println(x1);
		
		double d =100.200;
		String doubleData=String.valueOf(d);
		System.out.println(doubleData);
		
		
		//Convert String into premitve data type
		 String s1="1234";
		  int s=Integer.parseInt(s1);
		 System.out.println(s);
		 
		 String s2= "100.52";
		 double d1= Double.parseDouble(s2);
		 System.out.println(d1);
		 
		 
		 //onvert String Into wrapper class Output
		 
		 String s3="1234";
		 Integer s3Data=Integer.valueOf(s3);
		 System.out.println(s3Data);
		 
		 String s4= "100.52";
		Double dbData= Double.valueOf(s4);
		 System.out.println(dbData);
		 
		 
		 Integer k=5000;
		 System.out.println(k);
		 System.out.println(Boolean.parseBoolean("true"));
		 
	AceessModifiresDemo a = new AceessModifiresDemo();
	
	
	a.TestPublicMethod();           //Allowed everywhere
	a.defaultTestMethod();          //Within same package allowed
	a.TestProtectedMethod();       //Within same package allowed -->Outside package allowed with inheritence
	
	a.b=700;   //Default

	}

}
