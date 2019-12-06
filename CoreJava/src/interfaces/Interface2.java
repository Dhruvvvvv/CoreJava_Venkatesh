package interfaces;

import java.util.Scanner;

interface comparable {
	public abstract int compareTo(int x, int y);
}

class Smaller implements comparable {
	@Override
	public int compareTo(int x, int y) {

		if (x < y)
			return x;
		else 
			return y;
	}
}

class Greater implements comparable {
	@Override
	public int compareTo(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}
}

public class Interface2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x :");
		int x = Integer.parseInt(s.nextLine());
		System.out.println("Enter the value of y :");
		int y = Integer.parseInt(s.nextLine());
		System.out.println("1.Smaller \t 2.Greater");
		System.out.println("Enter your choice ");
		int choice = Integer.parseInt(s.nextLine());
		switch (choice) {
		case 1:
			Smaller small = new Smaller();
			System.out.println("Smaller value is: "+small.compareTo(x, y));
			break;
		case 2:
			Greater great = new Greater();
			System.out.println("Smaller value is: "+great.compareTo(x, y));
			break;
		default:
			System.out.println("Enter valid choice..");
			break;

		}
	}

}
