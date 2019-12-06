package MultiThreading;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 6; i++) {
			try {
				System.out.println("Counting.." + i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class AsExtendedThreadClass {
	public static void main(String[] args) {
		System.out.println("=========Thread with extended Thread class======");
		MyThread1 ob= new MyThread1();
		ob.start();
		System.out.println("Executing run() method by calling start() method");

	}
}
