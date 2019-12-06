package ExceptionHandling;

import java.util.Scanner;

interface ITestt {
	public int compareTo(int x, int y) throws Exception;
}

public class Check_ExceptionHandlingInInnerClass {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			ITestt t = new ITestt() {
				public int compareTo(int x, int y) throws Exception {
					try {
						if (x == y) {
							Exception ex = new Exception("Both are equal");
							throw ex;
						}
						if (x > y) {
							System.out.println("Greater is::" + x);
							return x;
						} else {
							System.out.println("Greater is ::" + y);
							return y;
						}
					} catch (Exception e) {
						throw e;
					}
				}

			};
			System.out.println("Enter the value of x::");
			int x= Integer.parseInt(s.nextLine());
			System.out.println("Enter the value of y::");
			int y= Integer.parseInt(s.nextLine());
			t.compareTo(x, y);

		} catch (Exception e) {
			System.out.println("Details::" + e.getMessage());
		}

	}
}
