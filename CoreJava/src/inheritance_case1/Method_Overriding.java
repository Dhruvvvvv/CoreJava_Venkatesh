package inheritance_case1;

class Parent1{
	public void m1() {
		System.out.println("Parent class m1 method");
	}
}
class Child1 extends Parent1{
	public void m1() {
		System.out.println("Child class m1 method");
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		
		Child1 c= new Child1();
		c.m1();
		Parent1 p= new Parent1();
		p.m1();

	}

}
