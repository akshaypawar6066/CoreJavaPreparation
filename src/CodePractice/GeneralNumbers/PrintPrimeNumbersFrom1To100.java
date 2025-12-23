package CodePractice.GeneralNumbers;

public class PrintPrimeNumbersFrom1To100 {
	public static void main(String[] args) {
		System.out.print("Prime Numbers are:");
		boolean isPrime=true;
		for(int i=1; i<=100;i++) {
			 for(int j=2;j<i; j++) {
				 if(i%j==0) {
					 isPrime=false;
					 break;
				 }
			 }
			 if(isPrime) {
				 System.out.print(i+",");
			 }
			 else {
				isPrime=true;
			 }
		}
	}

}
