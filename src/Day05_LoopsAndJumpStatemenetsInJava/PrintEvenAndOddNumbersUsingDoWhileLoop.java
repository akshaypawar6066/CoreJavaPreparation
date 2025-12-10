package Day05_LoopsAndJumpStatemenetsInJava;

public class PrintEvenAndOddNumbersUsingDoWhileLoop {
	
	public static void main(String[] args) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.println(i+" Even");
			}
			else
			{
				System.out.println(i+" Odd");
			}
			i++;
		}
		while(i<=10);
	}

}
