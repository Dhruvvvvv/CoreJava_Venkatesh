package WrapperClasses;

public class UnBoxingProcess {

	public static void main(String[] args) {
		Integer o1= new Integer(123);
		Float o2= new Float(124.435F);
		Boolean o3= new Boolean(false);
		Character o4= new Character('A');
		System.out.println("====Performing unboxing======");
		int a= o1.intValue();
		float b=o2.floatValue();
		boolean c=o3.booleanValue();
		char d=o4.charValue();
		System.out.println("int value:: "+a);
		System.out.println("float value:: "+b);
		System.out.println("boolean value:: "+c);
		System.out.println("char value:: "+d);

	}

}
