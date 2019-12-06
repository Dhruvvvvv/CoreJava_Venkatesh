package Array;

public class JaggedArray {

	public static void main(String[] args) {
		Integer a1[] = { 1, 2, 3 };
		Integer a2[] = { 11, 22, 33 };
		Integer a3[] = { 111, 222, 333 };
		Integer a[][] = { a1, a2, a3 };
		System.out.println("=======Display from Jagged Array========");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array:" + i + 1 + ":");
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(" " + a[i][j]);
				System.out.println("");
			}
		}

	}

}
