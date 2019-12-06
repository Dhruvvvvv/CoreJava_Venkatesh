package ExceptionHandling;

import java.util.Scanner;

interface ICompareable {
	public int compareTo(int x, int y) throws Greater;
}

class Greater extends Exception implements ICompareable {
	public Greater() {
	}

	public Greater(String msg) {
		super(msg);
	}

	public int compareTo(int x, int y) throws Greater {
		try {
			if (x == y) {
				Greater gt = new Greater("Both values are equal");
				throw gt;
			}
			if (x > y) {
				System.out.println("Greater::" + x);
				return x;
			} else {
				System.out.println("Greater::" + y);
				return y;
			}

		} catch (Greater ob) {
			throw ob;
		}
	}
}

public class Check_ExceptionHandlingInOverridingMethodOfInterface {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value of x:");
			int x = Integer.parseInt(s.nextLine());
			System.out.println("Enter value of y:");
			int y = Integer.parseInt(s.nextLine());
			Greater gt = new Greater();
			gt.compareTo(x, y);

		} catch (Greater gt) {
			System.out.println("Details:" + gt.getMessage());
		}

	}

}
