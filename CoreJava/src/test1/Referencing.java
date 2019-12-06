package test1;

import java.util.Scanner;

class Balance {
	double bal = 2000;

	public void getBal() {
		System.out.println("Available balance is: " + bal);
	}
}

class WithDraw {
	Balance x;

	public WithDraw(Balance x) {
		this.x = x;
	}

	public void withDrawMoney(int amt) {
		if (amt <= x.bal) {
			x.bal = x.bal - amt;
			System.out.println("Amount being withdraw: " + amt);
			System.out.println("Remaining balance is :" + x.bal);
		} else {

			System.out.println("Insufficient balance..!");
			System.out.println("Your current balance is only: " + x.bal);
		}
	}
}

public class Referencing {
	public static void main(String[] args) {
		Balance b = new Balance();
		WithDraw wd = new WithDraw(b);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw :");
		int amt = Integer.parseInt(s.nextLine());
		if (amt > 0 && amt % 100 == 0) {
			wd.withDrawMoney(amt);
		}
		else {
			System.out.println("Enter amount multiple of 100 only..!");
		}

	}
}
