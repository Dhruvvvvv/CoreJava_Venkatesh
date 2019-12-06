package inheritance_case1;

class Parent {
	public Parent() {
		System.out.println("Parent class constructor..");
	}

	int a = 10;
	public void m1()
	{
		System.out.println("Value of a is : "+a);
	}
	
	{
		System.out.println("Parent class non-static block.");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("Child class constructor");
	}
	
	int b=20;
	public void m2() {
		System.out.println("The value of b is :"+b);
	}
	
	{
		System.out.println("Child class non-static block.");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		
		Child c= new Child();
		c.m1();
		c.m2();
		Parent p =new Parent();
		p.m1();
		//p.m2(); Parent can't access child memebers
		
		
	}

}
