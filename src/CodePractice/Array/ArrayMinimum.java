package CodePractice.Array;

public class ArrayMinimum {
	
	public static void main(String[] args) {
		int a [] = {20,10,-25,30,45,90,65};
		
		int min = Integer.MAX_VALUE;
		
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Minimum Number from Array is:"+min);
	}


}
