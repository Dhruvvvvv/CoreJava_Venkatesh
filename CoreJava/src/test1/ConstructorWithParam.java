package test1;
class ConstructorClass{
	public ConstructorClass(int k) {
		System.out.println("From the constructor");
		System.out.println("The value of var passed is : "+k);

	}
}

public class ConstructorWithParam {
	public static void main(String[] args) {
		ConstructorClass c= new ConstructorClass(123);
	}

}
