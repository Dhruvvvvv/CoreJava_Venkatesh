package MultiThreading;

public class AsAnonymousInnerClassExtensionOfThreadClass {
	public static void main(String[] args) {
		System.out.println("Creating thread using anonymous inner class as extension of Thread class ");
		Thread obj1= new Thread() {
			public void run() {
				System.out.println("Inner class 1");
				for(int i=0; i<6;i++) {
					try {
						System.out.println("Inner class 1::"+i);
						Thread.sleep(2000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		
		Thread obj2= new Thread() {
			
			public void run() {
				System.out.println("Inner class2");
				for(int i=0;i<6;i++) {
					try {
					System.out.println("Inner class 2::"+i);
					Thread.sleep(2000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		System.out.println("===Executing start method for object 1======");
		obj1.start();
		System.out.println("=====Executing start method for object 2=====");

		obj2.start();

	}

}
