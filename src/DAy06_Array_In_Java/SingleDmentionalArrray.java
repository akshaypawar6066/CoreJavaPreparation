package DAy06_Array_In_Java;


/*
 * Declaray an arrray
 * Add values nto array
 * Find size of an array
 * read specifc value from array
 * read multple values from array
 */
public class SingleDmentionalArrray {
	static int b;

	public static void main(String[] args) {
		//Delration of annary
		//Aprroch 1
		/*
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println("Size of array is:"+a.length);
		*/
		/*
		
		//Apparch 2
		int a [] ={1,2,5,10,15,36};
		System.out.println("Size of array is:"+a.length);
		
		//Apparch 3
		int b[] = new int[] {1152,45,564,456,456,485,56};
		System.out.println(b.length);
		
		*/
		
		
		int a [] ={1,2,5,10,15,36};
	    //System.out.println(a.length);   //find Length of an array.
		
		//System.out.println(a[1]);        //Readspecifc value from array
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i :a) {                       //for each loop, enhanced for loop. 
			System.out.print(i+",");
		}
		System.out.println();
	

	}

}
