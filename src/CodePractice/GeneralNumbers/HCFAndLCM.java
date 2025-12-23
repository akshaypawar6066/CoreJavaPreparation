package CodePractice.GeneralNumbers;

import java.util.Scanner;

public class HCFAndLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		
		int min= Math.min(num1, num2);
		int hcf=1, lcm=1;
		
		for(int i=1; i<=min; i++ ) {
			
			if(num1%i==0 && num2%i==0) {
				hcf=i;
			}
		}
		
		lcm = (num1*num2)/hcf ;
		
		System.out.println("LCM is:"+lcm+" and HCF is:"+hcf);
	}

}
