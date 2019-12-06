package LocalInnerClass;

class Inner1 {
	public int a = 10;
	public static int b = 20;
	public static Inner1 x;// reference var to access non-static meber of outer inside static method of inner class

	public void m1() {
		class Sub11{
			public void sub11() {
				System.out.println("Outer class non-static var a:"+a);
				System.out.println("Outer class static var b:"+b);
			}
		}//LocalInnerClass
		Sub11 sub11= new Sub11();
		sub11.sub11();
	}
	public static void m2() {
		class Sub22{
			public void sub22() {
				System.out.println("Outer class non-static var a:"+x.a);
				System.out.println("Outer class static var b:"+b);
			}
		}//LocalInner class
		Sub22 sub22= new Sub22();
		sub22.sub22();
	}
}//outer class

public class LocalinnerClass {
	public static void main(String[] args) {
		Inner1 in= new Inner1();
		Inner1.x=in;
		in.m1();
		Inner1.m2();

	}

}
