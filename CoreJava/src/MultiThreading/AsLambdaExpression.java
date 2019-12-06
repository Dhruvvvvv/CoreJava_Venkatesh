package MultiThreading;

public class AsLambdaExpression {

	public static void main(String[] args) {
		System.out.println("Creating thread as Lambda Expression");
		Runnable ob= ()->{
			for(int i=0;i<6;i++) {
				try {
					System.out.println("Counting..."+i);
					Thread.sleep(3000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t= new Thread(ob);
		t.start();
	}
}
