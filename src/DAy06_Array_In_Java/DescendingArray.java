package DAy06_Array_In_Java;

public class DescendingArray {

	public static void main(String[] args) {
		int a[] = new int[] { 10, 100, 30, -40, 50, 61 };
		int temp;
		
		System.out.print("Before Sorting:");
		
		for(int z:a) {
			System.out.print(z+",");
		}
		System.out.println();
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.print("Array in descending order is:");
		for (int z : a) {
			System.out.print(z + ",");
		}
	}

}
