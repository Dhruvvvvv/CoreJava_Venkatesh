package inheritance_case1;

class Parent3 {
	
	public void m1() {
		System.out.println("M1 method from Parent3 class");
	}
	public void m2() {
		System.out.println("M2 method from Parent3 class");
	}
}

class Child3 extends Parent3{
	public void m1() {
		System.out.println("M1 method from child class and is ovveriding method of Parent3 m1 method.");
	}
	public void m3() {
		System.out.println("M3 method from Child3 class");
	}
}
public class Generalization {

	public static void main(String[] args) {

		Parent3 p = new Child3(); //In Generalizaton , object will have only overriding method from Child class and all members from Parent class.
		p.m1();
		p.m2();
		//p.m3()
		
		
	}

}
