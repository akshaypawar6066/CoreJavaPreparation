package CodePractice.Array;

import java.util.Arrays;

public class ShiftZeroesAtEnd {
	
	public static void main(String[] args) {
		int arr [] = {10,0,20,30,0,15,0,30};
		
		int index=0;
		
		for(int a:arr) {
			if(a!=0) {
				arr[index++]=a;
			}
		}
		
		while(index<arr.length) {
			arr[index++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
