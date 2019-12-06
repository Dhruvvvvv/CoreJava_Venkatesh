package ExceptionHandling;

import java.util.Scanner;

public class UnChecked_BuiltInUnCheckedException1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = Integer.parseInt(s.nextLine());
		float z = (57 / x);// For 0 it'll throw exception
		System.out.println("result:" + z);
	}
}
