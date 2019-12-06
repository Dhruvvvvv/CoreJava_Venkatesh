package OOPsConcept;

class LazyInstant{
	private static LazyInstant x=null;
	private LazyInstant() {}
	public static LazyInstant getRef() {
		if(x==null) {
			x= new LazyInstant();
		}
		return x;
	}
	public void m1() {
		System.out.println("Singleton class method");
	}
}
public class SingletonDesignPattern_LateOrLazyInstantiation {

	public static void main(String[] args) {
		LazyInstant  obj= LazyInstant.getRef();//Lazy instantiation
		System.out.println("Singleton object with lazy instantiation process");
		obj.m1();

	}

}
