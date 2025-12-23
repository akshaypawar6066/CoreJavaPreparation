package CodePractice.Array;

import java.util.Arrays;

public class ArrayAscending {
	public static void main(String[] args) {
		int [] a = new int [] {1,2,10,25,98,65};
		
		
		System.out.println("Regular Array is:"+Arrays.toString(a));
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		
		System.out.println("Array in Ascending Order is:"+Arrays.toString(a));
 		
	}

}
