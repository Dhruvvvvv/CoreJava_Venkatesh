package interfaces;

interface ITest {
	public static final int a = 10;

	public static final Balance b = new Balance();

}

class Balance {
	public double bal = 2000.0;

}

public class Interface1 implements ITest {

	public static void main(String[] args) {
		System.out.println("Balance :"+ITest.b.bal);
		System.out.println("The value of k:"+ITest.a);

	}	

}
