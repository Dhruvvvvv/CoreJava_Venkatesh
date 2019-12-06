package MultiThreading;

class Producer implements Runnable {
	public StringBuilder sb;

	public Producer() {
		sb = new StringBuilder();
	}

	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 6; i++) {
				try {
					sb.append(i + ":");
					System.out.println("Producer appending...");
					Thread.sleep(2000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Consumer implements Runnable {
	public Producer prod;

	public Consumer(Producer prod) {
		this.prod = prod;
	}

	public void run() {
		synchronized (prod.sb) {
			try {
				prod.sb.wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Dispaly using consumer..");
			System.out.println(prod.sb);
		}
	}
}

public class NotifyConcept {

	public static void main(String[] args) {
		Producer obj1= new Producer();
		Consumer obj2= new Consumer(obj1);
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		t2.start();
		t1.start();

	}

}
