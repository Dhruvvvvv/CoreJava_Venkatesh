package OOPsConcept;

class Singleton{
	
	private Singleton() {}
	private static Singleton x=null;
	
	static {
		x=new Singleton();
	}
	public static Singleton getRef() {
		return x;
	}
	public void m1() {
		System.out.println("m1 method to accessed through singleton object");
	}
	
}
public class SingletonDesignPattern_EarlyInstantiation {

	public static void main(String[] args) {
	//	Singleton ob= new Singleton();
		Singleton obj= Singleton.getRef();//sibgle obj created
		System.out.println("Singleton object with Early instantiation process");
		obj.m1();

	}

}
