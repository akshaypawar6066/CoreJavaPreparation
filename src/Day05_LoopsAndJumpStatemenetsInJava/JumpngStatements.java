package Day05_LoopsAndJumpStatemenetsInJava;

public class JumpngStatements {
	
	public static void main(String[] args) {
		/*
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		*/
		
		for(int i=1; i<=10; i++) {
			if(i==3 || i==5 || i==9) {
				continue;
			}
			System.out.println(i);
		}
	}

}
