package OOPsConcept;

public final class ImmutableClassnObject {
	private final double aNo;
	private final double bal;
	private final String addr;
	
	public ImmutableClassnObject(double aNo, double bal, String addr) {
		this.aNo=aNo;
		this.bal=bal;
		this.addr=addr;
	}
	public void dis() {
		System.out.println("Your account number is::"+aNo);
		System.out.println("Your balance is::"+bal);
		System.out.println("Your Address is::"+addr);
	}

	public static void main(String[] args) {
		ImmutableClassnObject obj= new ImmutableClassnObject(Math.random(), 2000.0f, "Hyd");
		System.out.println("=======Immutable object details=======");
		obj.dis();

	}

}
