package inheritance_case1;

class Parent2{
	public void m1(int a) {
		System.out.println("=========Parent Class=============");
		System.out.println("M1 method and passed value is: "+a);
	}
	
}
class Child2{
	public void m1(int a , int b) {
		System.out.println("==========Child Class===========");
		System.out.println("Overloaded m1 method from child class");
		System.out.println("Passed values are: "+a+","+b);
	}
	public void m1(int a, String b) {
		System.out.println("========Child class================");
		System.out.println("M1 method and int passed value is : "+a);
		System.out.println("M1 method and String passed value is : "+b);
	}
}
public class Method_Overloading {

	public static void main(String[] args) {
		Parent2 p= new Parent2();
		Child2 c= new Child2();
		p.m1(12);
		c.m1(123, 234);
		c.m1(987, "M1 method overloading"); 

	}

}
