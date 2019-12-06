package ExceptionHandling;

public class Checked_BuiltInCheckedException extends Exception {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=5;i++) {
			System.out.println("Sleeping:"+i);
			Thread.sleep(1000);
		}

	}

}
