package Day2_DataTypesAnd_Variables;

public class DataTypes {
	
	public static void main(String[] args) {
		//BAsicallly we have two different data types.
		//Premetive --->byte, short, int, long  (No without decimal) and float , double (to storedecimal No).
		//Non-Premtive data types--> String, ArralList, Hashmap, Hashse
		byte  k =100;
		short s =200;
		int i =500;
	      i='Z';
	      System.out.println("i value is:"+i);
		long l =60085656645656L;   // l/L literal needed 
		float f =200.20865965965555f;   //f/F literal needed 
		double a =100.25d;
		 final int q =200;   //We can to change value of q.
		char c ='A';
		boolean b =true;
		System.out.println(k+s);
		System.out.println("Sum of k and s are:"+(k+s));
		
		int z= (int)100.25;
		System.out.println("Value of z is:"+z);
		System.out.println("The value of L is:"+l);
		c=200;
		
		System.out.println("Value of Charcter C is:"+c);
		
	}

}
