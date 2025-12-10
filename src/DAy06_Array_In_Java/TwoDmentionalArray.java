package DAy06_Array_In_Java;

/*
 * Declaray an arrray
 * Add values nto array
 * Find size of an array
 * read specifc value from array
 * read multple values from array
 */

public class TwoDmentionalArray {

	public static void main(String[] args) {

		// apparoch 1
/*
		int a[][] = new int[4][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;


		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
        a[2][0]=70;
		a[2][1] = 80;
		a[2][2] = 90;

		a[3][0] = 100;
		a[3][1] = 110;
		a[3][2] = 120;
		
	
		for(int row[]:a) {
			for(int :row) {
               
				System.out.println(value+" ");
			}
			
		}
			
		
		*/
		
		 int a [][] = {{10,20,30}, {40,50,60}, {70,80,90}, {100,110,120}};
		 
		 
		 System.out.println("Numbers of rows are:"+a.length);
		 System.out.println("Numbers of columns in first row are:"+a[1].length);
		
			for(int i=0; i<a.length; i++) {
				for(int j=0;j<a[i].length; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("Third row and second column value:"+a[2][1]);
		}
	}


