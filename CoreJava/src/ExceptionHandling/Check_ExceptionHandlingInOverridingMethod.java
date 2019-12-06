package ExceptionHandling;

import java.util.Scanner;

class Calculate extends Exception {
	public Calculate() {

	}

	public Calculate(String msg) {
		super(msg);
	}

	public void cal(int x) throws SQRT {

	}
}

class SQRT extends Calculate {
	public SQRT() {
	}

	public SQRT(String msg) {
		super(msg);
	}

	public void cal(int x) throws SQRT {
		try {
			if (x == 0) {
				SQRT sqrt = new SQRT("Invalid number");
				throw sqrt;
			}
			System.out.println("Square root is::" + Math.sqrt(x));
		} catch (SQRT e) {
			throw e;
		}
	}
}

public class Check_ExceptionHandlingInOverridingMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for square root::");
		try {
			int x = Integer.parseInt(s.nextLine());
			SQRT sq = new SQRT();
			sq.cal(x);
		} catch (SQRT e) {
			System.out.println("Details:" + e.getMessage());
		}

	}

}
