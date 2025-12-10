package Day05_LoopsAndJumpStatemenetsInJava;

public class ForLoop {
	
	public static void main(String[] args) {
		/*
		//Print 1 to 10 Numbers.
		
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
		*/
		
		
		//Print 10 to 1 Numbers.
		/*
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		*/
		
		//Print Even and Odd No's from 1 to 10
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i+":Even No");
			}
			else {
				System.out.println(i+":Odd No");
			}
		}
		
	}

}
