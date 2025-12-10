package JavaCodePractice_day_21;

public class DuplicatesFromArray {
	
	
	public static void main(String[] args) {
		int a [] = {10,20,30,40,20,40,50};
		
		System.out.print("Duplicate No from Array:");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+",");
					break;
				}
			}
		}
	}

}
