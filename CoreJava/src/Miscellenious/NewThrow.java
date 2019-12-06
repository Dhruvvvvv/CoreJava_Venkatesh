package Miscellenious;

import java.util.Scanner;

class Sub extends Exception{
	public Sub(String msg) {super(msg);}
	public Sub() {
		// TODO Auto-generated constructor stub
	}
	public void verify(int age) {
		
		try {
		if(age>0) {
			System.out.println("Age:"+age);
			
		}
		else {
			Sub ex=new Sub("Not allowed");
			throw ex;
		}
		}catch(Sub ex) {
			ex.printStackTrace();
		}
		
		
	}
}
public class NewThrow  {

	public static void main(String[] args) {
		System.out.println("Enter age:");
		Scanner s = new Scanner(System.in);
		Integer age = Integer.parseInt(s.nextLine());
		Sub ob= new Sub();
		ob.verify(0);
     
		
	}


}
