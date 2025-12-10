package DAy06_Array_Practice;

public class PrintEvenAndOddNumbersFRomArray {
	
	public static void main(String[] args) {
		int a []= {1,3,4,6,5,10};
		int evenSum=0, evenCount=0, oddSum=0, oddCount=0;
		for(int x :a) {
			if(x%2==0) {
				System.out.println(x+ " Even");
				evenSum =evenSum+x;
				evenCount++;
			}
			else
			{
				System.out.println(x+" Odd");
				oddSum = oddSum+x;
				oddCount++;
			}
		}
		System.out.println();
		System.out.println("Count of Even Numbers:"+evenCount+ " and sum of them is:"+evenSum);
		System.out.println("Count of Odd Numbers:"+oddCount+ " and sum of them is:"+oddSum);
	}

}
