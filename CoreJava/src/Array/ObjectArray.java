package Array;

class Address {
	private String hNo;

	public Address(String hNo) {
		this.hNo = hNo;
	}

	public String toString() {
		return hNo;
	}
}

public class ObjectArray {

	public static void main(String[] args) {
		String ob1 = new String("hNo-12");
		Integer ob2 = new Integer(123);
		Address ob3 = new Address("12-23h");
		Object ob[] = { ob1, ob2, ob3 };
		System.out.println("====Display Array Object====");
		for (Object k : ob) {
			System.out.println(k);
		}

	}

}
