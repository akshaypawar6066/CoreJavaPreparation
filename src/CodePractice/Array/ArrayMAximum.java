package CodePractice.Array;

public class ArrayMAximum {
	public static void main(String[] args) {
		int a [] = {20,10,-25,30,45,90,65};
		
		int max=Integer.MIN_VALUE;
		
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Maximum Number from Array is:"+max);
	}

}
