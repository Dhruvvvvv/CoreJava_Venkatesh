package AnonymousInnerClass;

class Parent{
	public void m1() {
		System.out.println("Parent class m1 method");
	}
	public void m2() {
		System.out.println("Parent class m2 method");
	}
}
public class AIC_ClassExtension {

	public static void main(String[] args) {
		Parent p= new Parent() {
			public void m1() {
				System.out.println("Child class m1 ovveriding m1 of parent class method");
			}
			public void m3() {
				System.out.println("Child class m3 method");
			}
		};
		
		p.m1();
		p.m2();
		//p.m3(); Bcoz of generalixation we can hv only ovverind method from child.

		
	}

}
