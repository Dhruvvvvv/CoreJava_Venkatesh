package interfaces;

interface ITest3 {
	default void m() {
		System.out.println("Inside Interface default method");
	}
}

class Clazz implements ITest3 {
	public void m() {
		System.out.println("Overriding interface's default m() method in implementation class.");
	}
}
class Clazz1 implements ITest3{
	
}

public class IterfaceDefaultMethod {

	public static void main(String[] args) {
		
		Clazz obj= new Clazz();
		obj.m();
		Clazz1 obj1= new Clazz1();
		obj1.m();

	}

}
