package DAy06_Array_In_Java;

public class LargestNoFRomArray {
	
	public static void main(String[] args) {
		int a []= {10,20,100,30,40,500};
		int largestNo=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largestNo) {
				largestNo=a[i];
			}
		}
		
		System.out.println("Largest No from Array is:"+largestNo);
	}

}
