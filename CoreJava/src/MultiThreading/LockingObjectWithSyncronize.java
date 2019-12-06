package MultiThreading;

import java.util.concurrent.locks.Lock;

class Available {
	public static int available = 1;
}

 class DThread implements Runnable {

	public int wanted;

	public DThread(int wanted ) {
		this.wanted = wanted;
	}

	public void run() {

		synchronized (this) {
			String name = Thread.currentThread().getName();
			if (wanted <= Available.available) {
				System.out.println("=====Details=======");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Available.available = Available.available - wanted;
				System.out.println(wanted + " Berth is reserved for " + name);
			} else {
				System.out.println("Oops! No berth is available.."+name);

			}

		}
	}
}
public class LockingObjectWithSyncronize {
	public static void main(String[] args) {
		DThread d= new DThread(1);
		Thread t1= new Thread(d);
		t1.setName("User1");
		Thread t2= new Thread(d);
		t2.setName("User2");
		t2.start();
		t1.start();
		
		

	}

}
