package Day_04_Assignments;

public class SmallestOf_3_Numbers {
	public static void main(String[] args) {
		int a =-10, b=-25, c=-100;
		if(a<b && a<c) {
			System.out.println("a is smallest No:"+a);
		}
		else if(b<c) {
			System.out.println("b is smallest No:"+b);
		}
		else
		{
			System.out.println(" c is smallest No:"+c);
		}
	}

}
