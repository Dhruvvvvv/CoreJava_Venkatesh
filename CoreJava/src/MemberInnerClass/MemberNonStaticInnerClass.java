package MemberInnerClass;

class SubClass1 {
	public int a = 10;
	public static int b = 20;

	public void m1() {
		System.out.println("OuterClass non-static m1 method");
	}

	public static void m2() {
		System.out.println("Outerclass static m2 method");
	}

	// InnerClass starts
	public class SubClass2 {
		public int x = 30;
		// public static int y=40; static memberas Can't be declared inside member
		// innerclass
		// public static void m4() {}
		
		public void dis() {
			System.out.println("Outer class var a :"+a);
			System.out.println("Outer class static var b:"+b);
			System.out.println("Calling outer class's m1 and m2 methods::");
			m1();
			m2();
		}
	}

}

public class MemberNonStaticInnerClass {

	public static void main(String[] args) {
		SubClass1 sub1= new SubClass1(); //Outer class object
		SubClass1.SubClass2 sub2= sub1.new SubClass2();
		sub2.dis(); //InnerClass method call

	}

}
