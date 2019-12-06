package WrapperClasses;

public class AutoUnBoxingProcess {

	public static void main(String[] args) {
		System.out.println("=======Auto Boxing======");
		Integer a= 12;
		Float f= 123.234F;
		Boolean b= true;
		Character c= 'C';
		System.out.println("Integer:: "+a);
		System.out.println("Flaot:: "+f);
		System.out.println("Boolean:: "+b);
		System.out.println("Character:: "+c);
		System.out.println("======Auto UnBoxing=======");
		int p=a;
		float q=f;
		boolean r=b;
		char s=c;
		System.out.println("int :: "+p);
		System.out.println("float :: "+q);
		System.out.println("boolean :: "+r);
		System.out.println("char :: "+s);

	}

}
