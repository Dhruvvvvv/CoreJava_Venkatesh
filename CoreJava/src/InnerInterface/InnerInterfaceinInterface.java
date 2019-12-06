package InnerInterface;

import InnerInterface.Interface1.inner.InnerClass;

interface Interface1 {
	public static interface inner {
		public static void m1() {
			System.out.println("static concrete method in interface");
		}

		public default void m2() {
			System.out.println("Default concrete method inside interfae");
		}

		public void m3();

		public static class InnerClass implements inner {

			@Override
			public void m3() {
				System.out.println("overriding method of inner interface abstract method");
			}
		}// Inner class
	}

	InnerClass obj = new InnerClass();
	// Inner class Object
}

public class InnerInterfaceinInterface {

	public static void main(String[] args) {

		System.out.println("=======Calling inner class method=======");
		Interface1.inner.m1();
		Interface1.obj.m2();
		Interface1.obj.m3();

	}

}
