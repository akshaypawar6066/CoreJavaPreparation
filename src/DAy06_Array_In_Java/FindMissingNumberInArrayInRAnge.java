package DAy06_Array_In_Java;

public class FindMissingNumberInArrayInRAnge {
	
	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,7,9,10};
		
		int n=10;
		int expectedSum=n*(n+1)/2;
		int actualsum=0;
		for(int x:a) {
			actualsum =actualsum+x;
		}
		int missing=expectedSum-actualsum;
		System.out.println("Mssing number is:"+missing);
		
	}

}
