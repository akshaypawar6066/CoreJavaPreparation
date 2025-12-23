package CodePractice.Array;

public class PrintDuplicateNoFromArray {
	public static void main(String[] args) {
		Integer a [] ={10,20,30,40,10,20,50,60,50};
		
		System.out.print("Duplicate Numbers from Array is:");
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+",");
				}
			}
		}
		
	}
}
