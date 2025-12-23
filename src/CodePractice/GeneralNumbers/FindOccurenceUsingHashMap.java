package CodePractice.GeneralNumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindOccurenceUsingHashMap {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int a [] =new int [sc.nextInt()];
		
		System.out.println("Enter array values:");
		
		for(int i=0; i<a.length; i++) {
			a[i]= sc.nextInt();
		}
		
		
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer> ();
		
		for(Integer num :a) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		
		System.out.println("Enter Number for which you want occurence:");
		int num = sc.nextInt();

		   
		 int occurence=  countMap.getOrDefault(num, 0);
		
		System.out.println("Occurence of Given Number is:"+occurence);
		
		
	
	}

}
