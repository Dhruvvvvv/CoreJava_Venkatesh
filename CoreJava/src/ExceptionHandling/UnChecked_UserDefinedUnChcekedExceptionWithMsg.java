package ExceptionHandling;

import java.util.Scanner;

public class UnChecked_UserDefinedUnChcekedExceptionWithMsg extends Throwable {

	public UnChecked_UserDefinedUnChcekedExceptionWithMsg(String msg) {
		super(msg);

	}

	public static void main(String[] args) {
		System.out.println("Enter four digit pin:");
		Scanner s = new Scanner(System.in);
		try {
			String pin = s.nextLine();
			if (pin.length() != 4) {
				UnChecked_UserDefinedUnChcekedExceptionWithMsg ob = new UnChecked_UserDefinedUnChcekedExceptionWithMsg(
						"Only Four digit pin is valid !");
				throw ob;

			}
			System.out.println("Pin is valid:" + pin);

		} catch (UnChecked_UserDefinedUnChcekedExceptionWithMsg e) {
			System.out.println("Details: " + e.getMessage());
			System.out.println("Invalid pin");
		}

	}

}
