package MemberInnerClass;

class SubClass11{
	public int a=10;
	public static int b=20;
	public void m1() {
		System.out.println("Outer class non-static m1() method");
	}
	public static void m2() {
		System.out.println("Outer class static m2() method");
	}
	
	//StaticInnerClass starts
	static class SubClass22{
		public int x=30;
		public static SubClass11 s;
		//public static int y=40; static member can't be declared inside an innerclass
		public void dis() {
			System.out.println("Outerclass non static var a:"+s.a);
			System.out.println("Outerclass static var b:"+b);
			System.out.println("Calling outer class's m1 and m2 methods");
			//m1(); Non-static member of Outerclass can't be accessed in inner class
			//we can access by using reference of outer class.
			m2();
			System.out.println("Calling m1 using reference of SubClass11");
			s.m1();
		}
	}
}
public class MemberStaticInnerClass {

	public static void main(String[] args) {
		SubClass11 sub= new SubClass11();
		SubClass11.SubClass22.s= sub;
		SubClass11.SubClass22 obj= new SubClass11.SubClass22();
		obj.dis();
		
		

		
	}

}
