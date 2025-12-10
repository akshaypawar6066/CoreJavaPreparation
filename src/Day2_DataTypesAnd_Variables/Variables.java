package Day2_DataTypesAnd_Variables;

public class Variables {
	
	int a =30;
	{
		 a++;
	}
	static int count =0;
	void counter() {
		count++;
		System.out.println("Counter value is:"+count);
		System.out.println("Value of Non static Varibale A is :"+a);
	}

	public static void main(String[] args) {
		String name = "Akshay";
		System.out.println();
		Variables  v1 = new Variables();
		v1.counter();
		
		Variables  v2 = new Variables();
		v2.counter();
		
		Variables  v3 = new Variables();
		v3.counter();
		
	}

}
