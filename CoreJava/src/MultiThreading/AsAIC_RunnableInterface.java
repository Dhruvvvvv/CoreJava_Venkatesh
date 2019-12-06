package MultiThreading;

public class AsAIC_RunnableInterface  {

	public static void main(String[] args) {
		System.out.println("Creating Thread as AIC of implementing Runnable interface");
		Runnable obj1= new Runnable() {
			public void run() {
				System.out.println("====Object1===");
				for(int i=0;i<6;i++) {
					try {
						System.out.println("Object1::"+i);
						Thread.sleep(3000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable obj2= new Runnable() {
			public void run() {
				System.out.println("===Object2====");
				for(int i=0; i<6; i++) {
					try {
						System.out.println("Object2::"+i);
						Thread.sleep(3000);
						
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		System.out.println("Calling start method for 2 Objects....");
		Thread t1=new Thread(obj1);
		Thread t2= new Thread(obj2);
		t1.start();
		t2.start();

	}

}
