package interfaces;

interface ITest1{
	public static int a=20;
}
interface ITest2 extends ITest1{
	public static int b=30;
	public static void m() {
		System.out.println("ITest1 interface's var a is:"+a);
	}
}
public class InterfaceExtends implements ITest2 {
	public static void main(String[] args) {
		
		System.out.println("ITest2 b value is:"+ITest1.a);
		System.out.println("ITest1 a value is:"+ITest2.a);
		System.out.println("ITest1 a value is:"+ITest2.b);
		ITest2.m();
	}
	

}
