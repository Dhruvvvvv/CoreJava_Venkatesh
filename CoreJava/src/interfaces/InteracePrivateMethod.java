package interfaces;
interface ITest4{
	//private void m() {
	//	System.out.println("Iterface's non-static private method");
	//}
	//private static void m1() { //Valid for Java9
	//	System.out.println("Iterface's static private method");
	//}
	
	default void dis() {
		System.out.println("Static and non-static private concreate methods can be accessed by dfault method of the same interface ");
		//this.m();
		//ITest4.m1();
	}
}
class Clazz2 implements ITest4{
	
}
public class InteracePrivateMethod {

	public static void main(String[] args) {
		Clazz2 obj=new Clazz2();
		obj.dis();

	}

}
