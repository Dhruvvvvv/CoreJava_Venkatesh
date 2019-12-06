package MultiThreading;

import java.util.Scanner;

class Available1 {
	public static int avail = 8;
}

class Select {
	public synchronized void select(int n, String name) {
		System.out.println("=====" + name + "====");
		if (n <= Available1.avail) {
			for (int i = 0; i < n; i++) {
				System.out.println(name + ":" + i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Available1.avail = Available1.avail - n;
		} else {
			System.out.println("Sorry! No berth available....");
		}
	}
}

public class AsLocakAtMethodLevel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of seats for User1::");
		int n1 = s.nextInt();
		System.out.println("Enter the no of seats for User2::");

		int n2 = s.nextInt();
		Select s1 = new Select();
		Runnable obj1 = () -> {
			String name1 = Thread.currentThread().getName();
			s1.select(n1, name1);
		};

		Select s2 = new Select();
		Runnable obj2 = () -> {
			String name2 = Thread.currentThread().getName();
			s2.select(n2, name2);
		};
		Thread t1 = new Thread(obj1);
		t1.setName("User1");
		Thread t2 = new Thread(obj2);
		t2.setName("User2");
		t1.start();
		t2.start();

	}

}
