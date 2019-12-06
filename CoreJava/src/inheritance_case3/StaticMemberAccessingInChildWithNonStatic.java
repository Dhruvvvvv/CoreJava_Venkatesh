package inheritance_case3;

class Parent4{
	static int a= 10;
	static void m1(int a) {
		System.out.println("Parent4 static m1 method : "+ a);
	}
}

class Child4 extends Parent4{
	static int b =40;
	static void m1(int x) {
		System.out.println("Child4 static m1 method :"+ b);
	}
	
	public void m() {
		System.out.println("Accessing Parent4 static members with Child4's non-static members");
		super.m1(4543);
		System.out.println("Child3 non-static m method..!");
	}
}
public class StaticMemberAccessingInChildWithNonStatic {

	public static void main(String[] args) {

		Child4.m1(234);
		Child4 c =new Child4();
		c.m();
		
	}

}
