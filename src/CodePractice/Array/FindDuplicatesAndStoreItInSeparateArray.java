package CodePractice.Array;

import java.util.Arrays;

public class FindDuplicatesAndStoreItInSeparateArray {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 20,  50, 10,10, 20};
		System.out.println("Original Array is:"+Arrays.toString(a));
		int[] duplicateValuesArray = new int[a.length];
		int dupIndex = 0;

		for (int i = 0; i < a.length; i++) {
			
			boolean isAdded= false;
			for(int z=0;z<dupIndex;z++) {
				if(duplicateValuesArray[z]==a[i]) {
					 isAdded=true;
					 break;
				}
			}
		if(isAdded) continue;


		    for (int j = i + 1; j < a.length; j++) {
		        if (a[i] == a[j]) {
		           duplicateValuesArray[dupIndex++]=a[i];
		            break;
		        }
		    }
		}
	
		System.out.println("Duplicate elements from Array are:"+Arrays.toString(Arrays.copyOf(duplicateValuesArray, dupIndex)));

	}

}
