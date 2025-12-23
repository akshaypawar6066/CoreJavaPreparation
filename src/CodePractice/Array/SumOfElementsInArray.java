package CodePractice.Array;

public class SumOfElementsInArray {
	public static void main(String[] args) {
		int a [] = {10,20,30,40,50};
		int sum=0;
		
		
		for(int num:a) {
			sum=sum+num;
		}
		
		System.out.println("Sum Of array elemnts are:"+sum);
		
	}

}
