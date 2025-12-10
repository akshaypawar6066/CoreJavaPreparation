package DAy06_Array_In_Java;

import java.util.Arrays;

public class AcendingArray {
	
	public static void main(String[] args) {
		int a [] = {10,20,30,-10,40,42,80};
		int temp;
		
		System.out.print("Before sorting:");
		System.out.println(Arrays.toString(a));  //To print array values.
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Arrray in Ascending order is:");
		for(int z:a) {
			System.out.print(z+",");
		}
	}

}
