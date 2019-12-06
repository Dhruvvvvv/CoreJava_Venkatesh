package interfaces;

abstract class Abstract {
	double z;
	int x;

	Abstract(int x) {
		this.x = x;
	}

	abstract void calculate();

	public void dis() {
		System.out.println("Result :" + z);
	}
}

class SQRT extends Abstract {
	SQRT(int x) {
		super(x);
	}

	public void calculate() {
		z = Math.sqrt(x);
	}
}

public class InterfaceAbstract {
	public static void main(String[] args) {
		SQRT ob = new SQRT(25);
		ob.calculate();
		ob.dis();

	}

}
