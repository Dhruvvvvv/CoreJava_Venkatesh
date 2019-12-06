package ExceptionHandling;

import java.util.Scanner;

class Subclaz extends Throwable{
	Subclaz(){
	}
	Subclaz(String msg){
		super(msg);
	}
	
	public void verify(int age) {
		try {
			
		
		if(age<=0) {
			Subclaz ob= new Subclaz("Above 0 is valid");
			throw ob;
		}
		System.out.println("Welcome to Java world..!");
		}catch(Subclaz e) {
			System.out.println("Details:"+e.getMessage());
			System.out.println("Invalid age.");
		}
	}
}
public class UnChecked_ExceptionHandlingInSubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age= Integer.parseInt(s.nextLine());
		Subclaz sub=new Subclaz();
		sub.verify(age);
		

	}

}
