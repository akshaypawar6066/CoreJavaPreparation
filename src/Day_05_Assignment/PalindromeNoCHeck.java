package Day_05_Assignment;

import java.util.Scanner;

public class PalindromeNoCHeck {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		
		int revNo=0, rem=0, temp=num;
		while(num>0) {
			rem=num%10;
			revNo= revNo*10+rem;
			num=num/10;
		}
		
		num=temp;
		if(num==revNo) {
			System.out.println("Entered No Is PalindromeNo:"+" OriginalNo:"+num +" revered No:"+revNo);
		}
		else System.out.println("Enetered No is Not a palndrome No:"+" OriginalNo:"+num +" revered No:"+revNo);
	
}
}
