package MultiThreading;

 class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run() method");
		for (int i = 0; i <= 6; i++) {
			try {
				System.out.println("Counting ..." + i);
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
 }
 
 public class AsImpelementedRunnableInterface {
	public static void main(String[] args) {
		MyThread2 ob= new MyThread2();
		Thread t= new Thread(ob);
		System.out.println("Executing start method");
		t.start();

	}
 }

