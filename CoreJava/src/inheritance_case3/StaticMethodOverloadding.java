package inheritance_case3;

class Parent3{
	static void m1(int x) {
		System.out.println("Parent3 class m1 and value passed: "+x);
	}
}

class Child3 extends Parent3{
	static void m1(int x , int y) {
		System.out.println("Child3 m1 and passed values : "+x+","+y);
	}
	
	  static void m1(int x) { System.out.println("Value: "+x);
	  
	  }
	 
}
public class StaticMethodOverloadding {

	public static void main(String[] args) {
		
		Child3.m1(123);
		Child3.m1(123, 234);
		Child3.m1(123);// calling respective method not overriding method
		Parent3.m1(456);//
		//There is only static method overloading concept.
		//No concept of static method overriding bcoz methods r binded to class if we do,
		//then only respective class method will be called not overriding method.
		//Accessing static memebers of Parent in child can be done using this and super in non
		//static members only.
		
		
		

	}

}
