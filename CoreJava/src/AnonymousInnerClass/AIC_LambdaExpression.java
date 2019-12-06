package AnonymousInnerClass;

import java.util.Scanner;

interface Inter1 {
	public abstract int comapreTo(int x, int y);
}

public class AIC_LambdaExpression {

	public static void main(String[] args) {
		Inter1 in = (int x, int y) -> {
			if (x > y)
				return x;
			else
				return y;
		};

		Scanner s = new Scanner(System.in);
		System.out.println("Enter to value to find greater one::");
		int x = Integer.parseInt(s.nextLine());
		int y = Integer.parseInt(s.nextLine());
		System.out.println("Greater one is: " + in.comapreTo(x, y));

	}

}
