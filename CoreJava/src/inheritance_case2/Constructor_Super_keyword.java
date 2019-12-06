package inheritance_case2;

class Parent {
	public Parent() {
		System.out.println("Parent class constructor");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Child class constructor");
	}
}

public class Constructor_Super_keyword {
	public static void main(String[] args) {
		Child c = new Child();
		//parent class constructor will be called bcoz compiler at compilation stage will add super() in Child class 0-param constructor which 
		//will call Parent class 0-param constructor.
		//If child donsn't have even 0-param consctr then compiler will add default construcotr + super() in cosntrucotr as well.
	}

}
