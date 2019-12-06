package inheritance_case3;

class Parent2{
	static int a= 10;
	static void m1() {
		System.out.println("Parent2 class static m1 method"+a);
	}
	
	static {
		System.out.println("Parent2 classs static-block ");
	}
}

class Child2 extends Parent2{
	static int b=20;
	static void m2() {
		System.out.println("Child2 class static method m1"+b);
	}
	static {
		System.out.println("Child2 class static block");
	}
}
public class StaticOfParent {

	public static void main(String[] args) {
		
		Child2.m2();
		Child2.m1();
		

	}

}
