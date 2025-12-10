package DAy06_Array_Practice;

public class SumOfElementInArray {
	
	public static void main(String[] args) {
		
		int sum=0;
		System.out.print("Sum of elemnts in array is:");
		int a []= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			 sum=sum+a[i];
		}
		System.out.print(sum);
	}

}
