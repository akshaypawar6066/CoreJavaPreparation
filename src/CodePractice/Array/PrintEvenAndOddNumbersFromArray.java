package CodePractice.Array;

public class PrintEvenAndOddNumbersFromArray {
	public static void main(String[] args) {
		int a []= {10,15,20,25,30};
		
		int evenNoSum=0, oddNumSum=0, evenCount=0, oddCOunt=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+"=>Even");
				evenNoSum= evenNoSum+a[i];
				evenCount++;
			}
			else
			{
				System.out.print(a[i]+"=>Odd");
				oddNumSum= oddNumSum+a[i];
				oddCOunt++;
			}
			System.out.println();
		}
		
		System.out.println("Even Number sum is:"+evenNoSum);
		System.out.println("Odd Number sum is:"+oddNumSum);
		
		System.out.println("Even Count is:"+evenCount);
		System.out.println("Odd Count is:"+oddCOunt);
		
	}

}
