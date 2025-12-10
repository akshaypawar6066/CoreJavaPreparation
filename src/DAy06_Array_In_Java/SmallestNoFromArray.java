package DAy06_Array_In_Java;

public class SmallestNoFromArray {
	
	public static void main(String[] args) {
		int a []= {10,20,30,-20,40,50};
	   int smallestNo = Integer.MAX_VALUE;
     for(int i=0; i<a.length;i++) {
    	 if(a[i]<smallestNo) {
    		 smallestNo=a[i];
    	 }
     }
     System.out.println("Smallest No FRom Array is:"+smallestNo);
	}

}
