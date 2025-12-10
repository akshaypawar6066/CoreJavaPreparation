package JavaCodePractice_day_21;

public class FindDuplicateNumbersFromArray {
	
	public static void main(String[] args) {
		int a [] = {10,20,30,10,50,60,50,70};
		System.out.print("Duplcate Numbers from array:");
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
