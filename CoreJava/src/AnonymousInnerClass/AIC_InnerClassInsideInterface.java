package AnonymousInnerClass;

interface Interface {
	public class Subclass {
		public void m1() {
			System.out.println("Inner class non-static m1 method");
		}

		public static void m2() {
			System.out.println("Inner class static m2 method ");
		}
	}// Inner class

	Subclass sub = new Subclass();// Inner class object
}

public class AIC_InnerClassInsideInterface {

	public static void main(String[] args) {
		System.out.println("Calling non-static method");
		Interface.sub.m1();
		System.out.println("Calling static method");
		Interface.Subclass.m2();
		

	}

}
