package inheritance_case2;

class Parent1 {
	public Parent1(int a) {
		System.out.println("Parent1 class para-constructor, value of a is :" + a);
	}
}

class Child1 extends Parent1 {

	public Child1(int a) {
		super(a);
		System.out.println("Child class param-constrcr with super().");
	}

}

public class Param_Constructor {
	public static void main(String[] args) {
		Child1 c = new Child1(12);
	}

}
