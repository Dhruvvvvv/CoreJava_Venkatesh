package inheritance_case3;

public class StandardMainMethodOverloading {

	public static void main(String[] args) {

		StandardMainMethodOverloading.main(345.235f);
	}
	
	public static void main(float f) {
		System.out.println("Standard main method's overlading: "+f);
	}

}
