package JavaCodePractice_day_21;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int first=0,second=1, n=10, next=0;
		System.out.print("Fibonacci series:"+first+","+second+",");
		
		for(int i=2; i<=n; i++) {
			next=first+second;
			first=second;
			second=next;
			
			System.out.print(next+",");
		}
	}

}
